package Heaps;

import java.util.ArrayList;

public class heap_insert {
    public static void insert(int data,ArrayList<Integer>ans) {
        if(ans.isEmpty()){
            ans.add(data);
            return;
        }
        ans.add(data);
        int i=ans.size()-1;
        int par=(i-1)/2;
        while(ans.get(i)<ans.get(par)){//min heap
        // while(ans.get(i)>ans.get(par)){//max heap
            int temp=ans.get(i);
            ans.set(i, ans.get(par));
            ans.set(par, temp);
            i=par;
            par=(i-1)/2;

        }

    }
    public static void main(String[] args) {
        ArrayList<Integer> ans=new ArrayList<>();
        ArrayList<Integer> ans1=new ArrayList<>();
        ans.add(2);
        ans.add(3);
        ans.add(4);
        ans.add(5);
        ans.add(10);
        ans.add(1);
        System.out.println(ans);
        for (int i = 0; i < ans.size(); i++) {
            insert(ans.get(i), ans1);
        }
        System.out.println(ans1);
    }
}
