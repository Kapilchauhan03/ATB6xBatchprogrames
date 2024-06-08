package HW_23042024;

import java.util.Scanner;

public class HW_02 {

    public static void main(String[] args) {

        // Program to Check if a Number is Positive, Negative, or Zero.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Positive, Negative or zero");
        int num = sc.nextInt();

        if(num>0){
            System.out.println("Number is positve");
        } else if (num<0) {
            System.out.println("Number is negative");
        }else {
            System.out.println("Number is Zero");
        }
            sc.close();


    }
}
