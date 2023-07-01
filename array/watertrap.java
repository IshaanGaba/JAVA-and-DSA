package array;

public class watertrap {
    public static int water(int a[]) {
        int n=a.length;
        int wt=0;
        //left max
        int left[]=new int[n];
        left[0]=a[0]; 
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],a[i]);
        }

        //right max
        int right[]=new int[n];
        right[n-1]=a[n-1]; 
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],a[i]);
        }

        //waterlevel=min(max left,max right)
        //water trap=wl-height[i]
        for(int i=0;i<n;i++){
            int wl=Math.min(left[i],right[i]);
            wt+=wl-a[i];
            
        }
        return wt;
    }
    public static void main(String[] args) {
        int a[]={4,2,0,6,3,2,5};
        System.out.println(water(a));
    }
}
