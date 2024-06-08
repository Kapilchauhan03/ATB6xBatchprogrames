package ex_04052024_2D_Arrays;

public class lab020 {

    // 2D arrays Printing  3*3 Matrix both are equal

    public static void main(String[] args) {

        int [] [] array_2D = {

                {12,13,14},
                {15,16,17},
                {18,19,20}
        };

        for (int i =0; i<array_2D.length; i++){
            for (int j=0; j<array_2D[i].length; j++){
                System.out.println(array_2D[i][j]);
            }
        }
    }
}
