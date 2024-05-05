package Prac_20042024;

public class Max_of_3_Num {

    // Max between 3 Numbers with ? operators. a ? b :

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;
        int max;
        int min;

        max = (a>b && a>c) ? a : ( b>c && b>a) ? b : c ;
        min = (a<b && a<c) ? a : ( b<c && b<a) ? b : c ;

        System.out.println("max number is --> " + max);
        System.out.printf("min number is %d", min);


    }

}
