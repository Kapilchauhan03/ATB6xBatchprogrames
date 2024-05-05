package Prac_20042024;

public class Increments_Decrements {

    // Q - int a = 10; System.out.println(++a + a++ + a++);
    //Q. - int b = 10; System.out.println(--b + b++ + ++b); 9 + 9 + 11

    public static void main(String[] args) {

        int a = 10;
        int b = 10;

        System.out.println(++a + a++ + a++);
        System.out.println(a);

        System.out.println(--b + b++ + ++b);
        System.out.println(b);


    }
}
