package recursion;

import java.util.HashSet;

public class uniquesub {
    public static void uniques(String s,int i,StringBuilder sb,HashSet<String> set) {
        if (i==s.length()) {
            String b=sb.toString();
            if(!set.contains(b)){
                System.out.println(b);
                set.add(b);
            }
            return;
        }
        uniques(s, i+1, sb.append(s.charAt(i)), set);
        sb.deleteCharAt(sb.length()-1);
        uniques(s, i+1, sb, set);
    }
    public static void main(String[] args) {
        uniques("aaa", 0, new StringBuilder(), new HashSet<>());
    }
}
