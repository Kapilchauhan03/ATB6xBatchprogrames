package ex_23042024_ifelse;

import java.util.Scanner;

public class Lab016_evenodd {

    // Even & odd number using if else

    public static void main (String [] args ) {


       // int num = 50;
        Scanner sc = new Scanner(System.in);    // This statement using to take the user input
        System.out.println("Enter your number");
        int num = sc.nextInt();

        if (num%2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("ODD number");
        }
        sc.close();
    }
}
