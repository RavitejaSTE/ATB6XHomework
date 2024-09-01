/*  int[][] arr = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}    };

Transpose above given 2D array into below format

{       {1,4,7} ,
        {2,5,8} ,
        {3,6,9}  } */

public class ProgWithTranspose2DArray {
    public static void main(String[] args) {

        int[][] originalArray = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] transposeArray = new int[3][3];

        System.out.println("Before Transpose");
        for(int i=0; i<originalArray.length; i++){
            for(int j=0; j<originalArray.length; j++){
                System.out.print(originalArray[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("After Transpose");
        for (int i=0; i<originalArray.length; i++){
            for(int j=0; j<originalArray.length; j++){
                transposeArray[i][j]=originalArray[j][i];
                System.out.print(transposeArray[i][j]+" ");
            }
            System.out.println();
        }

    }
}
