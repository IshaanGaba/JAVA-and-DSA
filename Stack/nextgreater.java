package Stack;

import java.util.Stack;

//next smaller right---while(a[s.peek()]>=a[i])
//next smaller left---forloop-reverse,while(a[s.peek()]>=a[i])
//next greater left---forloop-reverse
//next greater right
public class nextgreater {
    public static void greater(int a[]) {
        Stack<Integer> s=new Stack<>();
        int greater[]=new int[a.length];
        for(int i=a.length-1;i>=0;i--){
            while(!s.isEmpty() && a[s.peek()]<=a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                greater[i]=-1;
            }
            else{
                greater[i]=a[s.peek()];

            }
            s.push(i);
        }
        for (int i = 0; i < greater.length; i++) {
            System.out.println(greater[i]);
        }
    }
    public static void main(String[] args) {
        int a[]={6,8,0,1,3};
        greater(a);

    }
}
