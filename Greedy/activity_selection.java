package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class activity_selection{
    public static ArrayList<Integer> activity(int s[],int e[]) {
        int jobs[][]=new int[s.length][3];
        for (int i = 0; i < s.length; i++) {
            jobs[i][0]=i;
            jobs[i][1]=s[i];
            jobs[i][2]=e[i];
        }
        // lambda fn
        Arrays.sort(jobs,Comparator.comparingDouble(o->o[2]));//sorting
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(0);
        int max=1;
        int lastEnd=jobs[0][2];
        for(int i=1;i<jobs.length;i++){
            if(jobs[i][1]>=lastEnd){
                ans.add(i);
                lastEnd=jobs[i][2];
                max++;
            }
        }
        System.out.println(max);
        return ans;
    }
    public static void main(String[] args) {
        int s[]={3,5,8,5,1,0};
        int e[]={4,7,9,9,2,6};
        System.out.println(activity(s, e));
    }    
}