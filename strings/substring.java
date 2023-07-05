package strings;

public class substring {
    public static String sub(String s,int se,int e) {//s.subtring(2,7)
        String a="";
        for(int i=se;i<e;i++){
            a+=s.charAt(i);
        }
        return a;
    }
    public static void main(String[] args) {
        String s="tony stark";
        System.out.println(s.substring(2, 7));//use this
        System.out.println(sub(s, 2, 7));
    }
}
