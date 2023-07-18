public class subset {
    public static void sub(String s,String ans,int i) {//2^n subsets
        //base case
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        //yes
        sub(s, ans+s.charAt(i), i+1);
        //no 
        sub(s, ans, i+1);

    }
    public static void main(String[] args) {
        String s="abc";
        sub(s, "", 0);
    }
}
