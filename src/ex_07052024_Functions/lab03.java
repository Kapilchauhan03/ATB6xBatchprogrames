package ex_07052024_Functions;

public class lab03 {

    // Calling Function Using For loop ----NO return type function

    public static void main(String[] args) {

        for ( int i=0; i<05; i++)
            say_kaps();

        say_mom();

    }

    private static void say_mom() {
        System.out.println("Mom");
    }

    static void say_kaps (){
        System.out.println("Hey Kaps! How are you!!");
    }
}
