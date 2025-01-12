public class swapwithoutstl {
    
        public static void quickSort2DArray(int[][] array, int low, int high, int col1, int col2) {
            if (low < high) {
                int pivotIndex = partition(array, low, high, col1, col2);
                quickSort2DArray(array, low, pivotIndex - 1, col1, col2);
                quickSort2DArray(array, pivotIndex + 1, high, col1, col2);
            }
        }
    
        private static int partition(int[][] array, int low, int high, int col1, int col2) {
            int[] pivot = array[high]; // Choose the last row as the pivot
            int i = low - 1;
    
            for (int j = low; j < high; j++) {
                // Compare based on col1 first, and col2 if col1 values are equal
                if (array[j][col1] < pivot[col1] || 
                    (array[j][col1] == pivot[col1] && array[j][col2] <= pivot[col2])) {
                    i++;
                    // Swap rows
                    int[] temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
    
            // Place the pivot in the correct position
            int[] temp = array[i + 1];
            array[i + 1] = array[high];
            array[high] = temp;
    
            return i + 1;
        }
    
        public static void print2DArray(int[][] array) {
            for (int[] row : array) {
                for (int elem : row) {
                    System.out.print(elem + " ");
                }
                System.out.println();
            }
        }
    
        public static void main(String[] args) {
            // Example 2D array
            int[][] array = {
                {3, 4, 2},
                {1, 9, 7},
                {8, 6, 5},
                {2, 1, 3},
                {3, 4, 1},
                {2, 1, 2}
            };
    
            System.out.println("Original Array:");
            print2DArray(array);
    
            // Sorting the 2D array based on col1, and col2 as a secondary sort
            int primaryColumn = 1; // col1
            int secondaryColumn = 2; // col2
            quickSort2DArray(array, 0, array.length - 1, primaryColumn, secondaryColumn);
    
            System.out.println("\nSorted Array by col1 and col2:");
            print2DArray(array);
        }
    }
    

