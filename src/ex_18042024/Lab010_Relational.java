package ex_18042024;

import com.sun.tools.javac.Main;

public class Lab010_Relational {

    // Relational operator
    // > ,<, >=, <= !=, ==

    public static void main(String[] args) {
        int age_kapil = 27;
        int age_Akshay= 29;

        // boolean result = age_kapil > age_Akshay;
        //boolean result = age_kapil < age_Akshay;
        boolean result = age_kapil >= age_Akshay;
        System.out.println(result);

        System.out.println('A'== 65);
        System.out.println('A'!= 65);
        System.out.println('B'== 65);
        System.out.println('B'== 66);

        System.out.println('A'== 65.2);

        // Not Gate

        System.out.println(10 > 20 );
        System.out.println(!(10 > 20));
        System.out.println(!!(10 > 20));
        System.out.println(!!!(10 > 20));

    }
}
