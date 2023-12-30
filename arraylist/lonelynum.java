package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class lonelynum {
    public static ArrayList findLonely(int[] l) {
        ArrayList<Integer> x = new ArrayList<>();
        if (l.length == 1) {
            x.add(l[0]);
            return x;
        }
        Arrays.sort(l);
        for (int i = 0; i < l.length; i++) {
            boolean flag = false;
            if (i == 0) {
                if (l[i + 1] - l[i] == 0 || l[i + 1] - l[i] == 1) {
                    flag = true;
                }
            } else if (i == l.length - 1) {
                if (l[i] - l[i - 1] == 0 || l[i] - l[i - 1] == 1) {
                    flag = true;
                }
            } else {
                if (l[i + 1] == l[i] || l[i + 1] - l[i] == 1 || l[i] - l[i - 1] == 1 || l[i - 1] == l[i]) {
                    flag = true;
                }
            }
            if (!flag) {
                x.add(l[i]);
            }
        }

        return x;
    }
    public static void main(String[] args) {
        int list[]={1,3,5,3};
        System.out.println(findLonely(list));
    }
}
