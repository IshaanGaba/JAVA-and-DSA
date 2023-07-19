package arraylist;

import java.util.ArrayList;

public class containerwithmostwater {
    public static int mostwater(ArrayList<Integer> height) {//n
        int lp=0;
        int rp=height.size()-1;
        int max=0;
        while (lp<rp) {
            int h=Math.min(height.get(lp),height.get(rp));
            int w=rp-lp;
            int a=w*h;
            max=Math.max(max, a);
            if(height.get(lp)<height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return max;
    }
    public static int most(ArrayList<Integer> height) {//n^2
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i+1; j < height.size(); j++) {
                int h=Math.min(height.get(j), height.get(i));
                int w=j-i;
                int area=h*w;
                max=Math.max(max, area);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(height);
        System.out.println(most(height));
        System.out.println(mostwater(height));
    }
}
//height-min(i,j)
//width--j-i
// area=w*h