package HW_02052024_Arrays;

import java.util.Scanner;

public class Multiply_array {

    // Multiply the array

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] num = new int[3];

        System.out.println("Enter num1");
        num[0] = sc.nextInt();
        System.out.println("Enter num2");
        num[1] = sc.nextInt();
        System.out.println("Enter num3");
        num[2] = sc.nextInt();

        System.out.println("Double of an array");
        for (int i=0; i<num.length; i++){
            System.out.println(num[i]*2);
        }
        sc.close();


    }
}
