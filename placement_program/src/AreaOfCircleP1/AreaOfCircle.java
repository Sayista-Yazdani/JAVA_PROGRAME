package AreaOfCircleP1;
/**here ‘import’ is a keyword in java used to get features from inbuilt packages.
 here we using a package called until it consists of many classes and we using one of the class Scanner to get command over console
 which is the interface between user and program.**/

/**The scanner is a class used to scan the input data which was given by the user through a console.
 so to get access on a console we want to create an object  Syntax:new Scanner(); after creating an object that reference will store in variable ‘s’**/

//The purpose of using the “Double ” is , whenever you enter the radius of a particular number like “7” , the answer is 153.86
// numbers after decimal points will also be displayed on the screen. Whereas if you use the “int” , the digits   after the decimal point will be loss.

import java.util.Scanner;
public class AreaOfCircle {
// calculate the area of circle by static method
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the Radius: ");
    double r=s.nextDouble();
    double area=3.14*r*r;
    System.out.println("Area of circle is: " + area);
}
}
