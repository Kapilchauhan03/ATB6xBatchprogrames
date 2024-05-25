package HW_20052024_Arrays;

import java.util.Scanner;

public class double_array {

    // Create a Program to double an array and store it also. {1,2,3} -> {2,4,6}

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
