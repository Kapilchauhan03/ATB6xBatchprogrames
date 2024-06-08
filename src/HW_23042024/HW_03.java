package HW_23042024;

import java.util.Scanner;

public class HW_03 {

    public static void main(String[] args) {

        // Program to Find the Largest Among Three Numbers:

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number1");
        int number1 = sc.nextInt();

        System.out.println("Enter the number2");
        int number2 = sc.nextInt();

        System.out.println("Enter the number3");
        int number3 = sc.nextInt();

        if(number1 >= number2 && number1>= number2){
            System.out.println("number1 is the largest");
        } else if (number2 >= number1 && number2>= number3) {
            System.out.println("number 2 is the largest");
            
        }else{
            System.out.println("number 3 is the largest");
        }

        sc.close();

    }

}
