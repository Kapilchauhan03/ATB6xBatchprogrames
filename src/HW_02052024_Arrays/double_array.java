package HW_02052024_Arrays;

public class double_array {

    // double the array

    public static void main(String[] args) {

        // Create a Program to double an array and store it also. {1,2,3} -> {2,4,6}

        int [] arrays = {20,30,40};
        int [] arrays2 = new int[3];

        for (int i=0; i<arrays.length; i++){
            arrays2[i] = arrays[i]*2;
        }
        System.out.println("Printing arrays");
        for (int i=0; i<arrays2.length; i++){
            System.out.println(arrays2[i]);
        }
    }
}
