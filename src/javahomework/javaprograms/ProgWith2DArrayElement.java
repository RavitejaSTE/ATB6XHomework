import java.util.Scanner;

public class ProgWith2DArrayElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of rows of a 2D Array");
        int row = sc.nextInt();

        System.out.println("Enter the Number of columns of a 2D Array");
        int column = sc.nextInt();

        int[][] arr = new int[row][column];
        System.out.println(row+" * "+column+ " 2D Array is created");

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.println("Enter the value for "+i+","+j+" position of the 2D Array");
                int val = sc.nextInt();
                arr[i][j]=val;
            }
        }
        System.out.println("Assigned the values for 2D Array");

        System.out.println("Enter the search element value of the 2D Array");
        int element = sc.nextInt();
        boolean status = false;

        int rowPosition = 0;
        int colPosition = 0;

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                if(arr[i][j]==element){
                    rowPosition=i;
                    colPosition=j;
                    status=true;
                }
            }
        }

        if (status=true){
            System.out.println("Search element is found at the "+rowPosition+" * "+colPosition+" position of the 2D array");
        }else {
            System.out.println("Search element is not found in the 2D Array");
        }
        sc.close();
    }
}
