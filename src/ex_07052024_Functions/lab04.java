package ex_07052024_Functions;

public class lab04 {

    // Return

    public static void main(String[] args) {

        hello ();
        sumOfTwoBad(4,8);
        int result = sumoftwogood(3,5);
        System.out.println(result);

    }

    static void hello() {
        System.out.println("HI!!!");
    }

    static void sumOfTwoBad (int a, int b){
        System.out.println(a+b);

    }

    static int sumoftwogood (int a, int b){
        return a+b;
    }
}
