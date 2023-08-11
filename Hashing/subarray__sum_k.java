package Hashing;

import java.util.HashMap;

public class subarray__sum_k {
    public static void main(String[] args) {
        int a[]={3,2,1};
        int k=3;
        HashMap<Integer,Integer> map=new HashMap<>();
        //(sum,count)
        //sum(j)-sum(i)=k----sum(i)=sum(j)-k
        int sum=0;
        int count=0;
        map.put(0, 1);//say first elmnt 3 sum is already 3.
        for (int j = 0; j < a.length; j++) {
            sum+=a[j];
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);

            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        System.out.println(count);

    }
}
