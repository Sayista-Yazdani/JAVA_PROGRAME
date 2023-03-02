package Static;
import java.util.*;
class Demo{
    static int a;
    static int b;
    int m;
    int n;
    static {
        a=10;
        b=10;
        System.out.println("First Print Static");
    }
    {
        m=200;
        n=500;
        System.out.println("Print 2nd line instance variable");
    }
    static void disp1(){
        System.out.println("Value of static var " + a);
        System.out.println("Value of static var " + b);
    }
    void disp2(){
        System.out.println("Value of instance variable " + m);
        System.out.println("Value of instance variable " + n);
    }
}

public class Static1 {
    public static void main(String[] args){
       Demo n = new Demo();
       Demo.disp1();
        n.disp2();



    }
}
