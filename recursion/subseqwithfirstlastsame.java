package recursion;
//for not contigous strings
public class subseqwithfirstlastsame {
    public static void subseq(String s,int i,String a) {
        if(i==s.length()){
            if(a!=""){
                if(a.charAt(0)==a.charAt(a.length()-1)){
                    System.out.println(a);
                }
            }
            return;
        }
        subseq(s, i+1, a+s.charAt(i));
        subseq(s, i+1, a);
    }
    public static void main(String[] args) {
        String s="aba";
        subseq(s, 0, "");
    }
}
