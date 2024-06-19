package recursion;

public class findfirstlast {
    public static int first=-1;
    public static int last=-1;
    public static void find(String s,int i,char ele) {
        if(i==s.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if(s.charAt(i)==ele){
            if(first==-1){
                first=i;
            }else{

                last=i;
            }
        }
        find(s, i+1, ele);
    }
    public static void main(String[] args) {
        find("ababcadbabbabb", 0, 'b');
    }
}
