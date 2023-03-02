import java.util.*;
public class Main {
     static public void main(String[] args) {
         byte o = 124;
        // Pattern Question Practice
    Scanner sc = new Scanner(System.in);
     int lp = sc.nextInt();
     int pl= sc.nextInt();
        // Nested Loop
        for(int m=1; m<=lp;m++){

            for(int k=1; k<=pl;k++){
                System.out.print("*");
            }
            System.out.println();
        }





        System.out.println("\nHello world!");
        System.out.println("Sayista how are you");
        int in1 = 4;
        byte age = 24;
        short age2 = 20;
        long l1 = 678990098765540L;
        float f1=5.1f;
        double do1= 54.6678D;
        char ch='a';
        String str="-----------Loops Practice-----------";
        System.out.println(str);
        for(int count=0; count<11; count++){
            System.out.println(count);
        }
        int i=11;
        while(i<21){
            System.out.println(i);
            i++;
        }

        int stg=0;
        do{
            System.out.println("----Do While practise----");
            stg++;
        }while(stg < 3);

        System.out.println("\n----Drawback of Do While Loop In below code------");
        int j=24;
        while(j<21){
            System.out.println(j); // it's not execute
            j++;
        }
        int g=20;
        do{
            System.out.println("----Do While Loop One time execute----");
            g++;
        }while(g<21);






    }
}