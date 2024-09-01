import java.util.Scanner;

public class LargestInThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1 st number");
        int firstNumber = sc.nextInt();
        System.out.println("Enter the 2nd number");
        int secondNumber = sc.nextInt();
        System.out.println("Enter the 3rd number");
        int thirdNumber = sc.nextInt();


        if(firstNumber>secondNumber && firstNumber>thirdNumber){
            System.out.println("1st number is the greatest of all -> "+firstNumber);
        } else if (secondNumber>firstNumber && secondNumber>thirdNumber) {
            System.out.println("2nd number is the greatest of all -> "+secondNumber);
        }else {
            System.out.println("3rd number is the greatest of all -> "+thirdNumber);
        }
    }
}
