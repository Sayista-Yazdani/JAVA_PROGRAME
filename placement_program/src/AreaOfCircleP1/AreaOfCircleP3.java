package AreaOfCircleP1;
import java.util.Scanner;
class AreaOfC{
    double Area;
    void circle(double r){
        Area = 3.14 * r * r;
    }
}
public class AreaOfCircleP3 extends AreaOfC{
    public static void main(String[] args) {
        AreaOfCircleP3 aoc = new AreaOfCircleP3();
        Scanner sc = new Scanner(System.in);
        System.out.println("By using Inheritance Enter the Radius: ");
        double r = sc.nextDouble();
        aoc.circle(r);
        System.out.println("The Radius pf Circle is: " + aoc.Area);
    }
}
