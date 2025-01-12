import java.io.*;
import java.util.*;

public class wormmhole {
    static class Vertex {
        int x, y;

        Vertex(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static int distance(Vertex src, Vertex dest) {
        return Math.abs(src.x - dest.x) + Math.abs(src.y - dest.y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        for (int testCase = 0; testCase < t; testCase++) {
            int numWormholes = sc.nextInt();
            int sx = sc.nextInt(), sy = sc.nextInt();
            int dx = sc.nextInt(), dy = sc.nextInt();

            Vertex source = new Vertex(sx, sy);
            Vertex destination = new Vertex(dx, dy);

            List<Vertex> vertices = new ArrayList<>();
            vertices.add(source);

            int[][] graph = new int[2 + 2 * numWormholes][2 + 2 * numWormholes];
            for (int[] row : graph) Arrays.fill(row, Integer.MAX_VALUE);

            int vertexIndex = 1;
            for (int i = 0; i < numWormholes; i++) {
                int x1 = sc.nextInt(), y1 = sc.nextInt();
                int x2 = sc.nextInt(), y2 = sc.nextInt();
                int cost = sc.nextInt();

                Vertex entry = new Vertex(x1, y1);
                Vertex exit = new Vertex(x2, y2);
                vertices.add(entry);
                vertices.add(exit);

                graph[vertexIndex][vertexIndex + 1] = cost;
                graph[vertexIndex + 1][vertexIndex] = cost;

                vertexIndex += 2;
            }

            vertices.add(destination);

            // Fill graph edges for direct distances
            for (int i = 0; i < vertices.size(); i++) {
                for (int j = 0; j < vertices.size(); j++) {
                    if (i != j && graph[i][j] == Integer.MAX_VALUE) {
                        graph[i][j] = distance(vertices.get(i), vertices.get(j));
                    }
                }
            }

            // Run Dijkstra-like algorithm manually
            int[] minDist = manualDijkstra(graph, 0);
            System.out.println(minDist[vertices.size() - 1]);
        }

        sc.close();
    }

    public static int[] manualDijkstra(int[][] graph, int start) {
        int n = graph.length;
        int[] dist = new int[n];
        boolean[] visited = new boolean[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;

        for (int i = 0; i < n; i++) {
            // Find the unvisited node with the smallest distance
            int minNode = -1;
            for (int j = 0; j < n; j++) {
                if (!visited[j] && (minNode == -1 || dist[j] < dist[minNode])) {
                    minNode = j;
                }
            }

            if (minNode == -1) break; // All reachable nodes visited

            visited[minNode] = true;

            // Update distances to neighbors
            for (int neighbor = 0; neighbor < n; neighbor++) {
                if (!visited[neighbor] && graph[minNode][neighbor] != Integer.MAX_VALUE) {
                    dist[neighbor] = Math.min(dist[neighbor], dist[minNode] + graph[minNode][neighbor]);
                }
            }
        }

        return dist;
    }

}
