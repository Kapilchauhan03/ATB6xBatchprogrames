package HW_20052024_Arrays;

import java.util.Scanner;

public class PrintArray {

    //Create a Program which takes arrays and print all the marks.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] marks = new int[5];

        System.out.println("Enter Sub1 marks");
        marks [0] = sc.nextInt();
        System.out.println("Enter Sub2 marks");
        marks [1] = sc.nextInt();
        System.out.println("Enter Sub3 marks");
        marks [2] = sc.nextInt();
        System.out.println("Enter Sub4 marks");
        marks [3] = sc.nextInt();
        System.out.println("Enter Sub5 marks");
        marks [4] = sc.nextInt();

        System.out.println("*********Marks**********");
        for (int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
            sc.close();
    }
}
