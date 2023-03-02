import java.util.*;
public class JavaPrac {
    public static void main(String[] args){
        // Q.1 Print the sum of First n Natural Number
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=num; i++)
        {
          sum = sum + i;
        }
        System.out.println(sum);

        System.out.println("--Q.2 Question Start---");

        // Q.2 Print the Table Take input from user
        System.out.println("--Enter Any Number Which You Want Print Table---");
        int tabN = sc.nextInt();
        for(int j=1; j<11; j++ ){
            System.out.println(tabN + "*" + j + "=" + tabN*j );
        }



        System.out.println("--Q.3 Question Start---");
        // Q.3 Make Calculator But Input takes from user
        System.out.println("--Enter 2 Number For calculation---");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int output;
        System.out.println("--Select the option For calculation---");
        System.out.println("-->Option 1. For Addition");
        System.out.println("-->Option 2. For Subtraction");
        System.out.println("-->Option 3. For Multiplication");
        System.out.println("-->Option 4. For Division");
        System.out.println("-->Option 5. For Modulo");

        int option=sc.nextInt();
        switch (option) {
            case 1:
                output = a + b;
                System.out.println("The Sum of : " + output);
                break;
            case 2:
                output = a - b;
                System.out.println("The Subtract of : " + output);
                break;
            case 3:
                output = a * b;
                System.out.println("The Multiplication of : " + output);
                break;
            case 4:if(b==0)
            {
                System.out.println("Invalid division");
            }
            else
            {
                output = a / b;
                System.out.println("The Division of : " + output);
            }
                break;
            case 5:if(b==0)
            {
                System.out.println("Invalid division");
            }
            else
            {
                output = a % b;
                System.out.println("The Modulo of : " + output);
            }
                break;
            default:
                System.out.println("Invalid Option");
        }


    // Q.4 Enter number is integer or not ?
        System.out.println("Enter the number for conformation about Number is Integer or not : ");
        System.out.println(sc.hasNextInt());
        // System.out.println(sc.hasNextDouble());
        // System.out.println(sc.hasNext());


    }
}
