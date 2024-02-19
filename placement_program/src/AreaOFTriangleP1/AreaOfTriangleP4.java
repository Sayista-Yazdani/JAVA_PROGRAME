package AreaOFTriangleP1;

import java.util.Scanner;

public class AreaOfTriangleP4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of side 1: ");
        double a=s.nextDouble();
        System.out.println("Enter the length of side 2: ");
        double b=s.nextDouble();
        System.out.println("Enter the length of side 3: ");
        double c=s.nextDouble();
        double semiPerimeter = (a+b+c)/2;
        double result= Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));

        System.out.println("The Area of triangle is: " + result);
    }
}
