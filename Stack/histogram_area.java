package Stack;

import java.util.Stack;

public class histogram_area {
    public static int area(int h[]) {
        int max_area=0;
        Stack<Integer> s=new Stack<>();
        int nsl[]=new int[h.length];//store index only and not value
        int nsr[]=new int[h.length];

        //next smallest left
        for (int i = 0; i < h.length; i++) {
            while (!s.isEmpty() && h[s.peek()]>=h[i]) {
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }
            else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }

        //next smallest right
        for (int i = h.length-1; i >=0 ; i--) {
            while (!s.isEmpty() && h[s.peek()]>=h[i]) {
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=h.length;
            }
            else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }

        //area-height*width----width=j-i-1
        for(int i=0;i<h.length;i++){
            int area=h[i]*(nsr[i]-nsl[i]-1);
            max_area=Math.max(area, max_area) ;  
        }
        return max_area;
    }
    public static void main(String[] args) {
        int h[]={2,1,5,6,2,3};
        System.out.println(area(h));
    }
}
