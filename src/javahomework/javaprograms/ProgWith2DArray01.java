public class ProgWith2DArray01 {

    public static int maxValue(int[][] a){
        int maxVal=0;
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                if(a[i][j]>maxVal){
                    maxVal=a[i][j];
                }
            }
        }
        return maxVal;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Max value in 2D Array is "+maxValue(arr));

    }
}
