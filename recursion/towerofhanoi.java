package recursion;

public class towerofhanoi {
    public static void tower(int n,String src,String help,String des) {
        if(n==1){
            System.out.println("transfer "+n +" from " +src+" to "+des);
            return;
        }
        tower(n-1, src, des, help);
        System.out.println("transfer "+n +" from "+src+" to "+des );
        tower(n-1, help, src, des);
    }
    public static void main(String[] args) {
        int n=3;
        tower(n, "S", "H", "D");
    }
}
