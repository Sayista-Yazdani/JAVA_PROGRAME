package Static;

public class PatternOne {
    public static void main(String[] args) {
        System.out.println("---Syntax for ABHI---");
        System.out.println(" ");
        int n = 5;
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
            System.out.print("   ");
            for (int j = 0; j < n; j++) {
                if ( i == 0 || j == 0 || j == n - 1 || i==n-1||i == (n - 1) / 2 )
                {
                    System.out.print("*");
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if ( j == 0 || j == n - 1 ||i == (n - 1) / 2 )
                {
                    System.out.print("*");
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                    System.out.print(" ");
                }

            }
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if ( i == 0 || i == n-1 || j == (n - 1) / 2 )
                {
                    System.out.print("*");
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("  ");
        System.out.println("---For B---");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ( i == 0 || j == 0 || j == n - 1 || i==n-1||i == (n - 1) / 2 )
                {
                    System.out.print("*");
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("---For H---");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ( j == 0 || j == n - 1 ||i == (n - 1) / 2 )
                {
                    System.out.print("*");
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                    System.out.print(" ");
                }

            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("---For I---");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ( i == 0 || i == n-1 || j == (n - 1) / 2 )
                {
                    System.out.print("*");
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        System.out.println("The Output is ABHI ;) ");




















    }
}
