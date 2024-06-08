package HW_23042024;

import java.util.Scanner;

public class HW_04 {
    public static void main(String[] args) {

        // Write a program that prints numbers from 1 to 100. However, for multiples of 3,
        // print "Fizz" instead of the number, and for multiples of 5, print "Buzz."
        // For numbers that are multiples of both 3 and 5, print "FizzBuzz."


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number from 1 to 100");
        int result = sc.nextInt();

        if(result%3==0 && result%5!=0){
            System.out.println("Fizz");
        } else if (result%5==0 && result%3!=0) {
            System.out.println("Buzz");
        }else{
            System.out.println(" Fizzbuzz");
        }
        sc.close();


    }
}
