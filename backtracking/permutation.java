public class permutation {
    public static void permu(String s,String ans) {//total n! permutation
        //base
        if(s.length()==0){
            System.out.println(ans);
            return;
        } 
        //recursion
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            String str=s.substring(0, i)+s.substring(i+1);
            permu(str, ans+c);
        }
    }
    public static void main(String[] args) {
        String s="abcd";
        permu(s, "");
    }
}
