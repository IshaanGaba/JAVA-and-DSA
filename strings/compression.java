package strings;


public class compression {
    public static String comp(String s) {// O(n)
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            Integer c=1;//to convert to string later on
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                c++;
                i++;
            }
            sb.append(s.charAt(i));
            if(c>1){
                sb.append(c.toString());
            }
            
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s="abc";
        System.out.println(comp(s));
    }
}
