package Parray_oops;
import java.util.Scanner;
public class Parray {
    public static void main(String args[]){
        int []arr1 = {2,6,7};
        int a = 5;
        // System.out.println(a);
        // System.out.println(arr1[1]);
        //System.out.println(arr1[2]);

        for(int i=0; i<arr1.length; i++) {
            System.out.println(arr1[i]);
          }

    String s1[]={"Abhi","Rupali"};
          for (int i=0; i< s1.length; i++){
              System.out.println(s1[i]);
          }


       Scanner sc = new Scanner(System.in);
          System.out.println("Enter the array size: ");
       int b = sc.nextInt();
       int arr[] = new int[b];


          for (int i=0; i < b; i++){
              System.out.println("Enter element "+ arr[i] + " :");
            arr[i] =sc.nextInt();

          }
















    }



}
