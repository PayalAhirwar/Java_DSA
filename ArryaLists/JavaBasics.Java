public class Patterns {

public static  void Inverted_rotated_half_pyramid(int n) {
    for(int i = 1; i<=n; i++) {
        for(int j = 1; j<=n-i; j++) {
            System.out.print("  ");
        }
        for(int j = 1; j<=i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
public static void inverted_half_pyramidwithNumbers(int n) {
    for(int i = 1; i<=n; i++) {
        for (int j = 1; j<=n-i+1; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
public static void floyds_triangle(int n) {
    int counter = 1;
    for(int i = 1; i<=n; i++) {
        for(int j = 1; j<=i; j++) {
    System.out.print(counter + " ");
    counter++;
        }
        System.out.println();
}
}
public static void zero_one_triangle(int n) {
    for(int i = 1; i<=n; i++) {
        for(int j = 1; j<=i; j++) {
            if( (i+j) % 2 == 0) {
                System.out.print("1"+ " ");
            } else {
                System.out.print("0"+ " ");
            }
        }
        System.out.println();
    }

}
public static void butterfly(int n) {
    for(int i=1; i<=n; i++) {
        for(int j=1; j<=i; j++) {
            System.out.print("*" + " ");
        }
        for(int j=1; j<=2*(n-i); j++){
            System.out.print("  ");
        }
        for(int j=1; j<=i; j++) {
            System.out.print("*" +" ");
        }
           System.out.println();
        }
       
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("*" + " ");
            }
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*" + " ");
            }
               System.out.println();
        }
     
    }
    public static void solid_rhombus(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=4; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void hollow_rhombus(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }
        for(int j=1; j<=n; j++) {
          if(i == 1 || i == n || j == 1 || j == n) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
        }
        System.out.println();
    }
    }
    public static void diamond_pattern(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--) {
             for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
public static void main(String args[]) {
    //Inverted_rotated_half_pyramid(4);
   // inverted_half_pyramidwithNumbers(10);
   //floyds_triangle(5);
  //zero_one_triangle(5);
 //butterfly(8);
 //solid_rhombus(5);
 //hollow_rhombus(8);
 diamond_pattern(5);
}
}
