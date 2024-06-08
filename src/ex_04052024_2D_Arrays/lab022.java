package ex_04052024_2D_Arrays;

public class lab022 {

    public static void main(String[] args) {

        int [] [] array_2d = {
                {11,12},
                {13,14},
                {15,16}
        };

        int row = array_2d.length;
        for (int i=0; i<row; i++) //row 0,1,2
            for (int j=0; j< array_2d[i].length; j++){
                System.out.println(array_2d[i][j]);
            }

    }

}
