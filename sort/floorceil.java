package sort;
//Given a sorted array and a value x, the ceiling of x is the smallest element in an array greater than or equal to x, and the floor is the greatest element smaller than or equal to x. Assume that the array is sorted in non-decreasing order. Write efficient functions to find the floor and ceiling of x. 
// https://www.geeksforgeeks.org/ceiling-in-a-sorted-array/
/*For example, let the input array be {1, 2, 8, 10, 10, 12, 19}
For x = 0:    floor doesn't exist in array,  ceil  = 1
For x = 1:    floor  = 1,  ceil  = 1
For x = 5:    floor  = 2,  ceil  = 8
For x = 20:   floor  = 19,  ceil doesn't exist in array*/

import java.util.ArrayList;

public class floorceil {
    public static ArrayList floorceil(int a[],int x,int s,int e,ArrayList<Integer> ans) {
        if(s>e){
            if(ans.size()==0){
                if((s-1)<0){
                    ans.add(-1);
                }else{

                    ans.add(a[e]);
                }
                if((s+1)>=a.length){

                    ans.add(-1);
                }else{
                    ans.add(a[s]);
                    
                }
            }            
            return ans;
        }
        int mid=s+(e-s)/2;
        if(a[mid]==x){
            ans.add(x);
            ans.add(x);
            return ans;
        }
        else if(a[mid]>x){
            return floorceil(a, x, s, mid-1, ans);
        }else{
            return floorceil(a, x, mid+1, e, ans);
        }

    }
    public static void main(String[] args) {
        int a[]={1, 2, 8, 10, 10, 12, 19};
        System.out.println(floorceil(a, 0, 0, a.length-1, new ArrayList<>()));
        System.out.println(floorceil(a, 1, 0, a.length-1, new ArrayList<>()));
        System.out.println(floorceil(a, 5, 0, a.length-1, new ArrayList<>()));
        System.out.println(floorceil(a, 20, 0, a.length-1, new ArrayList<>()));
    }
}
