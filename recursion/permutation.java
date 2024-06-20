public class permutation{
    public static void per(String s,String permutate) {
        if(s.length()==0){
            System.out.println(permutate);
            return;
        }
        for (int j = 0; j < s.length(); j++) {
            char ch=s.charAt(j);
            String news=s.substring(0, j)+s.substring(j+1);
            per(news,permutate+ch);
        }
    }
    public static void main(String[] args) {
        per("abc","");
    }
}