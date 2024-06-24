public class reachpt {
    public static boolean reach(int x1,int y1,int x2,int y2) {
        if(x1==x2 && y1==y2){
            return true;
        }
        else if(x1>x2 || y1>y2){
            return false;
        }
        System.out.println(x1+" "+y1);
        if(reach(x1, y1+x1, x2, y2)){
                return true;
            }
        if(reach(x1+y1, y1, x2, y2)){
                return true;
        }
        
        
        return false;

    }
    public static void main(String[] args) {
        System.out.println(reach(1, 1, 5, 2)); 
        System.out.println(reach(1, 1, 2, 3));
    }
}
