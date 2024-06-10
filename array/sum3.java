package array;
import java.util.*;
public class sum3 {
    public static void threeSum(int[] n) {
        
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        for(int i=0;i<n.length;i++){
          for(int j=i+1;j<n.length;j++){
            
            for(int k=j+1;k<n.length;k++){
                
                if(n[i]+n[j]+n[k]==0){
                    List<Integer> arr=new ArrayList<>();
                    arr.add(n[i]);
                    arr.add(n[j]);
                    arr.add(n[k]);
                    Collections.sort(arr);
                    ans.add(arr);
                }
            }
          }  
        }
        ans=new ArrayList<List<Integer>>(new LinkedHashSet<List<Integer>>(ans));
        System.out.println(ans);

    }
    public static void main(String[] args){
        int a[]={-1,0,1,2,-1,-4};
        threeSum(a);
    }
}
