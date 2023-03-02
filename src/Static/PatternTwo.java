package Static;

public class PatternTwo {
    public static void main(String[] args) {
        System.out.println("---Syntax for F---");
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j ==0 || i == (n-1)/2  ) {
                    System.out.print("**");

                } else {
                    System.out.print(" ");
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        System.out.println("Syntax For S And A ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0  || i==n-1 || j==0 && i<3 || i==(n-1)/2 || j==4 && i>2 )  {
                    System.out.print("*");
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                    System.out.print(" ");

                }
            }
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if ( i == 0 || j == 0 || j == n - 1 || i == (n - 1) / 2  )  {
                    System.out.print("*");
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                    System.out.print(" ");

                }
            }
            System.out.println(" ");
        }


        System.out.println(" ");
        System.out.println("Syntax For A");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ( i == 0 || j == 0 || j == n - 1 || i == (n - 1) / 2 )
                {
                    System.out.print("**");

                }
                else{
                    System.out.print(" ");
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        System.out.println("Syntax For Z And X ");
        n=6;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ( i == j ||i==0 || i==5)
                {
                    System.out.print("**");

                }
                else{
                    System.out.print(" ");
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            for (int j = 0; j < n; j++) {
                if ( i == j || i+j==n-1)
                {
                    System.out.print("**");

                }
                else{
                    System.out.print(" ");
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

        System.out.println("   ");
        System.out.println("Pattern Design");
        n=11;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ( i == j ||i+j==n-1||i+j==(n-1)/2 || i-j== (n-1)/2 || j-i== (n-1)/2 || i+j ==(n-1) + (n-1)/2)
                {
                    System.out.print("**");

                }
                else{
                    System.out.print(" ");
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }





        System.out.println(" ");
        System.out.println("Syntax For Fill");
        n=11;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                  if ( i == 0 && j <= (n-1)/2 || j == 0 && i <= (n-1)/2 || i+j <= (n-1)/2 ||
                        i == 0 && j >= (n-1)/2 || j==n-1 && i <= (n-1)/2 || j-i >= (n-1)/2 ||
                      j == 0 && i >= (n-1)/2 || i == n-1 && j <= (n-1)/2 || i-j >= (n-1)/2 ||
                      j == n-1 && i >= (n-1)/2 || i == n-1 && j >= (n-1)/2 || i + j >=(n-1) + (n-1)/2)
                  {
                    System.out.print("*");

                  }
                else{
                    System.out.print(" ");

                }
            }
            System.out.println(" ");
        }








        System.out.println(" ");
        System.out.println("Syntax for Ternary operator");

        // for (int i = 0; i < n; i++) {
         //   for (int j = 0; j < n; j++) {
           //     i == 0 || j == 0 || j == n - 1 || i == (n - 1) / 2 ? System.out.print("**"); : System.out.print(" "); System.out.print(" ");

            //}
          //  System.out.println(" ");
        //}










    }
}
