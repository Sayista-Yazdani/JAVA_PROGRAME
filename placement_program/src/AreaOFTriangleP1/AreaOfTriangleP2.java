package AreaOFTriangleP1;
import java.util.Scanner;

class Area{
    long area;
    public Area(long w, long h){
        area=(w*h)/2;
    }
}
public class AreaOfTriangleP2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width of Triangle: ");
        long w = sc.nextLong();
        System.out.println("Enter the height of Triangle: ");
        long h = sc.nextLong();
        Area a1 = new Area(w, h);
        System.out.println("Area Of Triangle is by using Constructor Concepts: " + a1.area);
    }
}
