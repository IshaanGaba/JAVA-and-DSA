package recursion;

public class lengths {
    public static int len(String s) {
        if(s.length()==0){
            return 0;
        }
        return len(s.substring(1))+1;

    }
    public static void main(String[] args) {
        String s="ishaan";
        System.out.println(len(s));
    }
}
