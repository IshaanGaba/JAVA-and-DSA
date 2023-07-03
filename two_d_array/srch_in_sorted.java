package two_d_array;

public class srch_in_sorted {
    public static int srch(int m[][], int k) {
        // starting from 40--->(0,m-1)
        int r = 0, c = m[0].length - 1;
        while (r < m.length && c >= 0) {
            if (m[r][c] == k) {
                System.out.println("at " + r + "," + c);
                return 1;
            } else if (m[r][c] > k) {
                c--;
            } else {
                r++;
            }
        }
        System.out.println("not found");
        return -1;

    }

    public static int srch1(int m[][], int k) {
        // starting from 32--->(n-1,0)
        int r = m.length-1, c = 0;
        while (c < m.length && r >= 0) {
            if (m[r][c] == k) {
                System.out.println("at " + r + "," + c);
                return 1;
            } else if (m[r][c] > k) {
                r--;
            } else {
                c++;
            }
        }
        System.out.println("not found");
        return -1;
    }

    public static void main(String[] args) {
        int m[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
        srch(m, 50);
        srch1(m, 50);
    }
}
