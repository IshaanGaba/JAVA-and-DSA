package array;

//this does not work for all -ve no.
public class kadane {
    public static int kadanesum(int a[]) {
        int n = a.length;
        int z = 0;
        for (int i = 0; i < n; i++) {//for -ve nos. ----- not imp
            if (a[i] >= 0) {
                z = 1;
                break;
            }
        }
        if (z == 1) {
            int cs = 0;// current sum
            int ms = Integer.MIN_VALUE;// max sum
            for (int i = 0; i < n; i++) {
                cs += a[i];
                if (cs < 0) {
                    cs = 0;
                }
                ms = Math.max(ms, cs);
            }
            return ms;
        } else {
            int s = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                s = Math.max(a[i], s);
            }
            return s;
        }

    }

    public static void main(String[] args) {
        int a[] = { -2, 3, -4, 1, -2, -1, -5, -3 };
        System.out.println(kadanesum(a));
    }

}
