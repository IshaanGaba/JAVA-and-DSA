package array;

public class subarray {
    public static int prifixsum(int a[]) {
        int n=a.length; 
        int p[]=new int[n];//prefix array that stores sum
        int s=Integer.MIN_VALUE;
        p[0]=a[0];
        for(int i=1;i<n;i++){
            p[i]=p[i-1]+a[i];//prefix[i]=sum of before +a[i]
        }
        for(int i=0;i<n;i++){
            int q=0;
            for(int j=i;j<n;j++){
                if(i==0){
                    q=p[j];
                }
                else{
                    q=p[j]-p[i-1];//sum=current- start se ek pehle in prefix array
                }
                s=Math.max(q, s);

            }
        }
        return s;
    }
    public static int brute(int a[]) {
        int s=Integer.MIN_VALUE;
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int p=0;
                for(int k=i;k<=j;k++){
                    p+=a[k];
                    s=Math.max(p, s);
                }
            }
        }
        return s;
    }
    public static void main(String[] args) {
        int a[]={5,-10,6,-1,6};
        System.out.println(brute(a));
        System.out.println(prifixsum(a));
    }
}