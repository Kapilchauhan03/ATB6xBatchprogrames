package ex_04052024_2D_Arrays;

public class lab021 {

    // Printing 2*3 arrays 2 rows & 3 colums

    public static void main(String[] args) {

        int [] [] array_2D = {

                {12,13,14},
                {22,23,24},
        };

        int row = array_2D.length;
        for (int i=0; i<row; i++){   //Row 0,1
            for (int j=0; j<array_2D[i].length; j++) // column 0,1,2
                System.out.println(array_2D[i][j]);
        }
    }
}
