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
    public static void Floyd_triangle(int n){
        int c=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
    public static void traingle_01(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print('1');
                }
                else
                System.out.print('0');
            }
            System.out.println();
        }
    }
    public static void butterfly(int n) {
        //1st half
        for(int i=1;i<=n;i++){
            //star
            for(int j=1;j<=i;j++){
                System.out.print('*');
            }
            
            //space
            for(int j=1;j<=(2*(n-i));j++){
                System.out.print(' ');
            }
            //star
            for(int j=1;j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    
        //2nd half
        for(int i=n;i>=1;i--){
            //star
            for(int j=1;j<=i;j++){
                System.out.print('*');
            }
            
            //space
            for(int j=1;j<=(2*(n-i));j++){
                System.out.print(' ');
            }
            //star
            for(int j=1;j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void solid_rhombus(int n) {
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(' ');
            }
            //stars
            for(int j=1;j<=n;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void hollow_rhombus(int n) {
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(' ');
            }
            //stars
            for(int j=1;j<=n;j++){
                if(i==1|i==n|j==1|j==n){
                    System.out.print('*');
                }
                else{
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
    public static void diamond(int n) {
        //1st half
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(' ');
            }
            //stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print('*');
            }
            System.out.println();
        }
        //2nd half
        for(int i=n;i>=1;i--){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(' ');
            }
            //stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        // hollow_rectangle(5,4);
        // inverted_rotated_half_pyramid(5);
        // inverted_half_pyramid_withnos(5);
        // Floyd_triangle(4);
        // traingle_01(5);
        // butterfly(5);
        // solid_rhombus(5);
        // hollow_rhombus(5);
        diamond(5);
    }
}
