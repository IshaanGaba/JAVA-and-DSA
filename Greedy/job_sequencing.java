package Greedy;

import java.util.ArrayList;
import java.util.Collections;

import Greedy.job_sequencing.Job;

/**
 * job_sequencing--------wrong code in notebook
 */
public class job_sequencing {
    static class Job{
        int id;
        int deadline;
        int profit;
        public Job(int x,int y,int z){
            this.id=x;
            this.deadline=y;
            this.profit=z;
        }
    }
    public static void jobs(ArrayList<Job> arr) {
        int maxdeadline=Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            maxdeadline=Math.max(maxdeadline,arr.get(i).deadline);
        }
        Collections.sort(arr,(a,b)->b.profit-a.profit);//descendiing
        int slot[]=new int[maxdeadline];
        for (int i = 0; i < slot.length; i++) {
            slot[i]=-1;
        }
        int profit=0;
        int c=0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = arr.get(i).deadline-1; j >=0; j--) {
                if(slot[j]==-1){
                    slot[j]=arr.get(i).id;
                    profit+=arr.get(i).profit;
                    c++;
                    break;
                }
            }
        }
        System.out.println(c);
        System.out.println(profit);
    }
    public static void main(String[] args) {
        ArrayList<Job> arr=new ArrayList<>();
        int n=4;
        int d[]={4,1,1,1};
        int p[]={40,10,40,30};
        for (int i = 1; i <= p.length; i++) {
            arr.add(new Job(i, d[i-1], p[i-1]));
        }
        jobs(arr);

    }
}