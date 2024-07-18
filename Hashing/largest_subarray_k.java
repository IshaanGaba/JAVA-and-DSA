package Hashing;
// max subarray with sum =k
import java.util.HashMap;
public class largest_subarray_k {

    // Function for finding maximum and value pair
    public static int lenOfLongSubarr(int a[], int n, int k) {
        // Complete the function
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int sum = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            
            // Check if sum is equal to k
            if (sum == k) {
                max = i + 1;
            }
            
            // Check if (sum - k) exists in the map
            if (map.containsKey(sum - k)) {
                max = Math.max(max, i - map.get(sum - k));
            }
            
            // Only add sum to the map if it does not already exist
            // to ensure the longest subarray is found
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int a[] = {1, -1, 3, -3, 2, -2, 4, -4};
        int n = a.length;
        int k = 0;
        System.out.println(lenOfLongSubarr(a, n, k)); // Output should be 8
    }
}
    

