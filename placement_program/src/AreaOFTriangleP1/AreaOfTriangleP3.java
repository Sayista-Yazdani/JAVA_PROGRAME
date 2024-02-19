package AreaOFTriangleP1;

import java.util.Scanner;

class AriaTrig{
    long a;
    public long Aria(long w, long h){
       a=(w*h)/2;
       return a;
    }
}
public class AreaOfTriangleP3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Width of Triangle: ");
        long w =sc.nextLong();
        System.out.println("Enter the Height of Triangle: ");
        long h=sc.nextLong();
        AriaTrig T=new AriaTrig();
        long r = T.Aria(w,h);
       System.out.println("The Area Of Triangle by using Method Concepts: " + r);

    }
}
