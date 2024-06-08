package HW_23042024;

import java.util.Scanner;

public class HW_01
{

    public static void main(String[] args) {

        // Program to Check if a Character is a Vowel or a Consonant.

        Scanner sc = new Scanner(System.in);
        System.out.println(" To check if the character is vowel or consonant");
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){
            System.out.println("it is a vowel");

        }else {
            System.out.println("it is a consonant");
        }

        sc.close();


    }
}
