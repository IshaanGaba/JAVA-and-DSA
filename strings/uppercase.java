package strings;

public class uppercase {
    public static String upper(String s) {//Character.toUpperCase(index)
        StringBuilder sb=new StringBuilder("");
        sb.append(Character.toUpperCase(s.charAt(0)));
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==' '  && i<s.length()-1){
                sb.append(s.charAt(i));
                i++;
                sb.append(Character.toUpperCase(s.charAt(i)));
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s="hi i m tony STARK ";
        System.out.println(upper(s));
    }
}
