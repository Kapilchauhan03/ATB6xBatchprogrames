package ex_20042024_String;

public class Lab014_Ternary {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int max = a<b ? b : a;
        int min = a<b ? a : b;
        System.out.println(max);
        System.out.println(min);


    }
}
