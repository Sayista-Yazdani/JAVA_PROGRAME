package AreaOfCircleP1;
import java.util.Scanner;

// Program of AreaOfCircle using Constructor oR Method
public class AreaOfCircleP4{
    double Area;
    AreaOfCircleP4(double r){      // Constructor
        Area = 3.14 * r * r;
    }
//    void Circle( double r){      //Method
//        Area = 3.14 * r * r;
//    }

    public static void main(String[] args) {
//        AreaOfCircleP4 aoc = new AreaOfCircleP4();
        Scanner sc = new Scanner(System.in);
        System.out.println("By using Inheritance Enter the Radius: ");
        double r = sc.nextDouble();
        AreaOfCircleP4 aoc = new AreaOfCircleP4(r);               // Constructor Call
//       aoc.Circle(r);                                            // Method call
        System.out.println("The Radius pf Circle is: " + aoc.Area);
    }
}
