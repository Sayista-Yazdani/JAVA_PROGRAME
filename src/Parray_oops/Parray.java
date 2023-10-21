package Parray_oops;
import java.util.Scanner;

public class Parray {


    public static void main(String[] args){
        // program for matching vowel
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String input: ");
        String w= sc.next();
        int c=0;

        char d[] = {'a','e','i','o','u'};
       for(char[] rw:d ) {
           for(char a : rw) {
               System.out.println("enter " + a);
//
//           }
           }
       }
        if (c == w.length()) {
            System.out.println("User string match with vowels");
        } else {
            System.out.println(" the String not match ");
        }







    //For  display array Element
        int []arr1 = {2,6,7};
       // int a = 5;
        // System.out.println(a);
        // System.out.println(arr1[1]);
        //System.out.println(arr1[2]);

        for(int i=0; i<arr1.length; i++) {
            System.out.println(arr1[i]);
          }
        for(int o:arr1) {      // for each loop
            System.out.println(o);
        }

    String s1[]={"Abhi","Rupali"};   // display string array element
              for (int i=0; i< s1.length; i++){
              System.out.println(s1[i]);
          }

         // for taking array size from console
        //when element of array doesn't know then new int[b] use
        System.out.println("Enter the array size: ");
        int b = sc.nextInt();
        int arr[] = new int[b];
        for (int i=0; i < b; i++){
              System.out.println("Enter element "+ arr[i] + " :");
              arr[i] =sc.nextInt();

          }


















    }



}
