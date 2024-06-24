package array;

import java.util.Arrays;

// Given an array of N integers where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets such that: 

// Each student gets one packet.
// The difference between the number of chocolates in the packet with maximum chocolates and the packet with minimum chocolates given to the students is minimum.
// Examples:

// Input : arr[] = {7, 3, 2, 4, 9, 12, 56} , m = 3 
// Output: Minimum Difference is 2 
// Explanation:
// We have seven packets of chocolates and we need to pick three packets for 3 students 
// If we pick 2, 3 and 4, we get the minimum difference between maximum and minimum packet sizes.

// Input : arr[] = {3, 4, 1, 9, 56, 7, 9, 12} , m = 5 
// Output: Minimum Difference is 6 



public class choco {
    public static int min(int a[],int m) {
        Arrays.sort(a);
        int min=Integer.MAX_VALUE;
        if(m>a.length){
            return -1;
        }
        for (int i = 0; i < a.length; i++) {
            if(i+m-1<a.length){
                min=Math.min(min, a[i+m-1]-a[i]);
            }else{
                break;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = {3, 4, 1, 9, 56, 7, 9, 12} ;
        int  m = 5;
        System.out.println(min(arr, m)); 
    }
}
