import java.util.Scanner;

public class PositiveNegativeZeroNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = sc.nextInt();

        if(number>0){
            System.out.println("The entered number is a positive number");
        } else if (number<0) {
            System.out.println("The entered number is a negative number");
        }else {
            System.out.println("The entered number is a zero");
        }
    }
}
