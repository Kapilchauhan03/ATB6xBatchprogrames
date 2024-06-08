package ex_07052024_Functions;

import java.util.Scanner;

public class lab005 {

    // calculator

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();

        //Calc
        int r_sum = sum(num1, num2);
        int r_mul = mul(num1, num2);
        int r_sub = sub(num1, num2);
        int r_div = div(num1, num2);

        System.out.println("sum is --> "+ r_sum);
        System.out.println("mul is --> "+ r_mul);
        System.out.println("sub is --> "+ r_sub);
        System.out.println("div is --> "+ r_div);


    }
    static int sum(int a, int b){
        return a+b;
    }
    static int mul(int a, int b){
        return a*b;
    }
    static int sub(int a, int b){
        return a-b;
    }
    static int div(int a, int b){
        return a/b;
    }

}
