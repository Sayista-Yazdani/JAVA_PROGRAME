package AreaOfCircleP1;

// Calculate the Circumference of a circle through parse (CMD)
public class PerimeterOfCircleP1 {
    public static void main(String[] args) {

        System.out.println("Enter the Radius: "+ args[0]);
        double r = Double.parseDouble(args[0]);
        double perimeter = 2*3.14*r;
        System.out.println("The perimeter of circle is: " + perimeter);

    }
}
