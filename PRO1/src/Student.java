
import java.util.*;
class Stu_details {

    Scanner sc = new Scanner(System.in);
    String n;
    int r;
    String a,c;
    double sub1,sub2,sub3,sub4,sub5;
    double total;
    double per;
    void input()
    {
        System.out.println("Enter the Name:-");
        n=sc.nextLine();
        System.out.println("Enter the Rollno:-");
        r=sc.nextInt();
        String a1=sc.nextLine();
        System.out.println("Enter the Address:-");
        a=sc.nextLine();
        System.out.println("Enter the Stream:-");
        c=sc.nextLine();
        System.out.println("Enter the Subject1 Marks:-");sub1=sc.nextDouble();
        System.out.println("Enter the Subject2 Marks:-");sub2=sc.nextDouble();
        System.out.println("Enter the Subject3 Marks:-");sub3=sc.nextDouble();
        System.out.println("Enter the Subject4 Marks:-");sub4=sc.nextDouble();
        System.out.println("Enter the Subject5 Marks:-");sub5=sc.nextDouble();
    }
    void cal()
    {
        total=(sub1+sub2+sub3+sub4+sub5);
        per=(total*100/500);
    }
    void display()
    {
        System.out.println("Name:-"+n);
        System.out.println("Rollno:-"+r);
        System.out.println("Address:-"+a);
        System.out.println("Stream:-"+c);
        System.out.println("Subject1 Marks:-"+sub1);
        System.out.println("Subject2 Marks:-"+sub2);
        System.out.println("Subject3 Marks:-"+sub3);
        System.out.println("Subject4 Marks:-"+sub4);
        System.out.println("Subject5 Marks:-"+sub5);
        System.out.println("Total Marks:-"+total);
        System.out.println("Percentage:-"+per+"%");
    }
}
public class Student {
    public static void main(String[] args)
    {
        Stu_details obj =new Stu_details();
        obj.input();
        obj.cal();
        obj.display();
    }
}


