package ex_04052024_2D_Arrays;

public class lab025 {

    // printing stars for 5
    public static void main(String[] args) {

        int num = 5;
        for (int i=0; i<5; i++){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
