package recursion;
//in subsequence order of the string remains same----O(2^n)
public class printsubsequences {
    public static void subsequence(String s,int i,String a) {
        if(i==s.length()){
            System.out.println(a);
            return;
        }
        //include it
        subsequence(s, i+1, a+s.charAt(i));

        //not include
        subsequence(s, i+1, a);
    }
    public static void main(String[] args) {
        String s="abc";
        subsequence(s, 0, "");
    }
}
