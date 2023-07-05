package strings;

public class largest {
    public static String l(String s[]) {//lexicographic ordering compare 1st a b
        String l=s[0];
        for(int i=1;i<s.length;i++){
            if(l.compareTo(s[i])<0){//s.compareTo(s1)-->0-equal-->-ve-s1-->+ve-s
                l=s[i];
            }
        }
        return l;
    }
    public static void main(String[] args) {
        String s[]={"apple","mango","banana","y"};
        System.out.println(l(s)); 
    }
}
