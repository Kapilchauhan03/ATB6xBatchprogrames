package Prac_20042024;

public class Vlaue_of {

      // Question;- find     value of absolute
    public static void main(String[] args) {

        double x = 10;
        double y = 12.4;
        double z = 56.78;

        double result = Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z));

        //double result =Math.cbrt(Math.sqrt(x)+Math.sqrt(y)-Math.abs(z));


        System.out.println(result);

        //  double math1= x*x;
        //  double math2=Math.pow(y,2);
        //  double math3=Math.abs(z);
        //  System.out.println(math1+" "+math2+" "+math3);


    }
}
