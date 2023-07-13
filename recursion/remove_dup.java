package recursion;

public class remove_dup {
    public static void dup(String s,StringBuilder sb,int i,boolean map[]) {
        if(i==s.length()){

            System.out.println(sb);
            return;
        }
        char x=s.charAt(i);
        if(map[x-'a']==false){
            map[x-'a']=true;
            dup(s,sb.append(s.charAt(i)),i+1,map);
        }
        else{
           dup(s,sb,i+1,map);
        }
    }
    public static void main(String[] args) {
        String s="iisshahaanan";
        StringBuilder sb=new StringBuilder("");
        dup(s, sb, 0, new boolean[26]);//map-->false initially
    }
}
