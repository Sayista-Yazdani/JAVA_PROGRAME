package IsoScaleTriangle;

import java.util.Scanner;

public class isoScaleTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of same side: ");
        double a = sc.nextDouble();
        System.out.println("Enter the side2: ");
        double b = sc.nextDouble();
        double  area=(b/4)*Math.sqrt((4*a*a)-(b*b));
        System.out.println("The area of isoScaleTriangle: " + area);

    }
}
