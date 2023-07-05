package strings;

public class shortestpath {
    public static float sp(String s) {
        int x=0,y=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='N'){
                y++;
            }
            else if(s.charAt(i)=='S'){
                y--;
            }
            else if(s.charAt(i)=='E'){
                x++;
            }
            else{
                x--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt((x2+y2));
    }
    public static void main(String[] args) {
        String s="NSEW";
        System.out.println(sp(s));
    }
}
