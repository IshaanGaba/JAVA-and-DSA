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
            if (sum == 0) {//imp---------
                max = j + 1;
            }//The line if (sum == 0) { max = i + 1; } checks if the sum of all elements from the beginning of the array up to the current index i is zero. If this is true, the length of the subarray from the start to the current index is i + 1. This is crucial for finding subarrays that start from the very beginning of the array and have a sum of zero.
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
