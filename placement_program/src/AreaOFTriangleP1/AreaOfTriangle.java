package AreaOFTriangleP1;
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Width Of Triangle: ");
        double w=sc.nextInt();
        System.out.println("Enter the Height Of Triangle: ");
        double h= sc.nextInt();
        double AreaOfTri = (w*h)/2;
        System.out.println("The Area OF Triangle Is by using static concepts: " + AreaOfTri);
    }
}
