package ex_07052024_Functions;

public class lab006 {

    // Money to begger
    public static void main(String[] args) {

        giveMoneyBeg();
        main("Kapil");
        landing();


        int money = giveMoneyToFriend(100);
        System.out.println(money);

        double money1 = Money(90.389479343);
        System.out.println(money1);

        double money2 = Money(908745.0099);
        System.out.println(money2);

        int Money3 = moneyyyz(98895);
        System.out.println(Money3);


    }

    static void giveMoneyBeg (){
        System.out.println("Blessing !!");
    }

    static int giveMoneyToFriend (int i){
        return i ;
       // return i= i+30;
    }

    static void main(String a){
        System.out.println(a);
    }

    static double Money(double i){
        return i;
    }

    static void landing(){
        System.out.println("Boss");
    }

    static int moneyyyz(int i){
        return i;
    }

}
