package arraylist;

public class mostfrequentno {
    public static int mostFrequent(int[] nums, int key) {
        int max = 0;
        int result = 0;
        int map[] = new int[1000];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key) {
                map[nums[i + 1] - 1]++;
            }
        }
        for (int i = 0; i < 1000; i++) {
            if (map[i] > max) {
                max = map[i];
                result = i + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int a[] = { 1, 100, 200, 1, 100 };
        System.out.println(mostFrequent(a, 1));
    }
}
