public class function {// dec to bin ,bin to dec

    public static int sum(int a,int b){//parameters
        return a+b;
    }
    public static int fact(int a){
        int f=1;
        for(int i=1;i<=a;i++){
            f=f*i;
        }
        return f;
    }
    public static boolean prime(int a) {
        for(int i=2;i<=a/2;i++){
            if(a%i==0){
                return false;
            }

        }
        return true;
    }
    public static int btod(int n) {
        int d=0,i=0;
        while(n>0){
            int l=n%10;
            d=d+(l*(int)Math.pow(2,i));
            i++;
            n=n/10;
        }
        return d;
    }
    public static int dtob(int n) {
        int b=0,i=0;
        while(n>0){
            int l=n%2;
            b=(b)+(l*(int)Math.pow(10, i));
            i++;
            n=n/2;
        }
        return b;
    }
    public static void main(String[] args) {
        /*int s=sum(4,5);//arguments
        System.out.println(s);
        s=fact(6);
        System.out.println(s);
        for(int i=1;i<100;i++){
            if(prime(i)){
                System.out.println(i);
            }
        }*/
        int s=btod(1001);
        System.out.println(s);
        int d=dtob(4);
        System.out.println(d);
    }
}
