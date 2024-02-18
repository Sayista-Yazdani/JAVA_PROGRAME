package AreaOfCircleP1;
import java.util.Scanner;

interface AreaInterface{
    void circleArea(double r);
}
class AreaOfCircleP2 implements AreaInterface {
double Area;
    @Override
    public void circleArea(double r) {
        Area=3.14*r*r;
    }
    public static void main(String[] args) {
        AreaOfCircleP2 aoc = new AreaOfCircleP2();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Radius By using Interface: ");
        double r=s.nextDouble();
        aoc.circleArea(r);
        System.out.println("Area of circle is: " + aoc.Area);


    }

}
