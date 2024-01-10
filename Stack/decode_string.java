import java.util.Stack;
public class decode_string{
    public static String decodeString(String a) {
            Stack<String> s=new Stack<>();
            Stack<Integer> n=new Stack<>();
            int k=0;
            for(int i=0;i<a.length();i++){
                String s1=""+a.charAt(i);
                if(Character.isDigit(a.charAt(i))){
                    k=(k*10)+((a.charAt(i))-'0');
                }
                else if(s1.equals("]")){
                    String temp="";
                    while(!s.peek().equals("[")){
                        temp=s.pop()+temp;
                    }
                    s.pop();
                    int num=n.pop();
                    
                    s.push(temp.repeat(num));
                }else{
                    if(s1.equals("[")){
                        n.push(k);
                        k=0;
                    }
                    s.push(s1);
                }
    
            }
            String s3="";
            while(!s.isEmpty()){
                s3=s.pop()+s3;
            }
            return s3;
    
        }
    public static void main(String[] args) {
        String s="3[a2[c]]";
        System.out.println(decodeString(s));
    }
}