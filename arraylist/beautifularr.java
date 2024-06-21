package arraylist;

import java.util.ArrayList;

public class beautifularr {
    public static int[] beautyopt(int n) {
        int ans[]=new int[n];
        if(n==1){
            return new int[]{1}; 
        }else if(n==2){
            return new int[]{1,2};
        }else{
            int odd[]=beautyopt((n+1)/2);
            int even[]=beautyopt(n/2);
            for(int i=0;i<odd.length;i++){
                ans[i]=odd[i]*2-1;
            }
            for(int i=0;i<even.length;i++){
                ans[odd.length+i]=even[i]*2;
            }
        }
        return ans;
    }
    public static ArrayList beauty(int n) {
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(1);
        //even -2*ele    odd -2*ele-1
        for (int i = 2; i <= n; i++) {
            ArrayList<Integer> temp=new ArrayList<>();
            for (int j = 0; j < ans.size(); j++) {
                int curr=2*ans.get(j)-1;
                if(curr<=n){

                    temp.add(curr);
                }
            }
            for (int j = 0; j < ans.size(); j++) {
                int curr=2*ans.get(j);
                if(curr<=n){

                    temp.add(curr);
                }
            }
            ans=temp;
        }
        return ans;
    }
    public static void main(String[] args) {
        // System.out.println(beauty(3));
        int n = 5; // You can change this value to test other inputs
        int[] result = beautyopt(n);
        for (int i : result) {
            System.out.print(i + " ");
        }
        
    }
}
