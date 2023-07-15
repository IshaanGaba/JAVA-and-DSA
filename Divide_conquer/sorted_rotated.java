package Divide_conquer;

public class sorted_rotated {
    public static int modified_bin(int a[],int k,int s,int e) {
        //imagine using graph
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(a[mid]==k){
            return mid;
        }
        //on line 1
        if(a[s]<=a[mid]){
            if(a[s]<=k && k<=a[mid]){
                return modified_bin(a, k, s, mid-1);
                
            }
            else{
                return modified_bin(a, k, mid+1,e);

            }

        }
        // line2
        else{
            if(a[mid]<=k && k<=a[e]){
                return modified_bin(a, k, mid+1, e);
            }
            else{
                return modified_bin(a, k, s, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int a[]={4,5,6,7,0,1,2};
        System.out.println(modified_bin(a, 0, 0, a.length-1));
    }
}
