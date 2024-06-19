package recursion;

public class subsequences {
    public static void sub(String s,int i,String newString) {
        if(i==s.length()){
            System.out.println(newString);
            return;
        }
        sub(s, i+1, newString+s.charAt(i));//choice to get enter
        sub(s, i+1, newString);//choice to not enter
    }
    public static void subopt(String s,int i,StringBuilder sb) {
        if(i==s.length()){
            System.out.println(sb);
            return;
        }
        subopt(s, i+1, sb.append(s.charAt(i)));//choice to get enter
        sb.deleteCharAt(sb.length()-1);
        subopt(s, i+1, sb);//choice to not enter
    }
    public static void main(String[] args) {
        subopt("abc",0,new StringBuilder());
    }
}
