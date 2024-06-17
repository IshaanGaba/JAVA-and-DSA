package Divide_conquer;

// Find the majority element in the array. A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element)

public class majority {
    public static int major(int a[],int n) {
        int c=0,ans=0;
        for(int i=0;i<a.length;i++){
            if(c==0){
                ans=a[i];
            }
            if(ans==a[i]){
                c++;
            }else{
                c--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int A[]={3, 3, 4, 2, 4, 4, 2, 4,4,4};
        System.out.println(major(A, A.length));
    }
}
