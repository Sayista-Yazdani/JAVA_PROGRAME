package IsoScaleTriangle;

import java.util.Scanner;

public class isoScaleTriangleP2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the same side of Triangle: ");
        double a =sc.nextDouble();
        System.out.println("Enter the length of base");
        double b = sc.nextDouble();
        double halfBase= b/2;
        double heightSqr= a*a - halfBase*halfBase;
        if(heightSqr>0){
            double height = Math.sqrt(heightSqr);
            System.out.println("The height of IsoScale Triangle is : " + height);
        }
        else{
            System.out.println("The given length is not make IsoScale Triangle because it's not same length");
        }
    }
}
