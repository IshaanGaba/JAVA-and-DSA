package Greedy;
//deadline and profit

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class job_sequencing {
    public static int sequence(int a[][]) {
        int profit=0;
        int job[][]=new int[a.length][3];
        ArrayList<Integer> ans=new ArrayList<>();
        for (int i = 0; i < job.length; i++) {
            job[i][0]=i;
            job[i][1]=a[i][0];
            job[i][2]=a[i][1];
        }
        Arrays.sort(job, Comparator.comparingDouble(o->o[2]));//ascending order
        
        int time=0;
        for (int i=job.length-1;i>=0;i--) {
            if(time<job[i][1]){
                ans.add(job[i][0]);
                profit+=job[i][2];
                time++;
            }
        }
        System.out.println(ans);
        return profit;
    }
    public static void main(String[] args) {
        int a[][]={{4,20},{1,10},{1,40},{1,30}};
        System.out.println(sequence(a));
    }
}
