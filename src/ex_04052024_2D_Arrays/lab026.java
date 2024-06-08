package ex_04052024_2D_Arrays;

public class lab026 {

    // Printing 3*4 arrays

    public static void main(String[] args) {

        int [] [] array_2d = {
                {12,13,14,15},
                {22,33,44,88},
                {55,66,77,99}
        };
        int row = array_2d.length;
        for (int i=0; i< array_2d.length; i++){
            for (int j=0; j<array_2d[i].length; j++){
                System.out.println(array_2d[i][j]);
            }
        }


    }
}

