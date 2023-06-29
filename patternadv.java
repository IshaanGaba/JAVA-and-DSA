public class patternadv {
    public static void hollow_rectangle(int m,int n) {
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==m|| j==1| j==n){
                    System.out.print('*');
                }
                else{
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

    }
    public static void inverted_rotated_half_pyramid(int n) {
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(' ');
            }
            //star
            for(int j=1;j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void inverted_half_pyramid_withnos(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        // hollow_rectangle(5,4);
        // inverted_rotated_half_pyramid(5);
        inverted_half_pyramid_withnos(5);
    }
}
