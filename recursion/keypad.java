package recursion;

public class keypad {
    public static String key[]={"","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void keys(String s,int i,StringBuilder sb ) {
        if(i==s.length()){
            System.out.println(sb);
            return;
        }
        String l=key[s.charAt(i)-'0'];
        for (int j = 0; j < l.length(); j++) {
            keys(s, i+1, sb.append(l.charAt(j)));
            sb.deleteCharAt(sb.length()-1);
            
        }
    }
    public static void main(String[] args) {
        keys("23", 0, new StringBuilder());
    }    
}
