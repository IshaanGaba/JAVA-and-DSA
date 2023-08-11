package Hashing;

import java.util.HashMap;

public class largest_subarray_sum0 {
    public static void main(String[] args) {
        int a[]={15,-2,2,1,7,-8,10,12};
        HashMap<Integer,Integer> map=new HashMap<>();
        //sum,length of a
        int sum=0;
        int len=0;
        for(int j=0;j<a.length;j++){
            sum+=a[j];
            if(map.containsKey(sum)){
               len=Math.max(len,j- map.get(sum)); //sum(j)-sum(i)=sum(i+1..j)
            }
            else{
                map.put(sum, j);
            }
        }
        System.out.println(len);
    }
}
