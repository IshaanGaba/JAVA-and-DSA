package strings;

public class compare {
    public static void main(String[] args) {
        String s="abc";
        String s2="abc";
        String s1=new String("abc");
        if(s==s1){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        if(s==s2){
            System.out.println(true);
            
        }
        else{
            System.out.println(false);
        }
    }
}
