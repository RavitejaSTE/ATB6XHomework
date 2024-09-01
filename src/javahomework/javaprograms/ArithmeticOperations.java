import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first input");
        int input1 = sc.nextInt();
        System.out.println("Enter the second input");
        int input2 = sc.nextInt();

        System.out.println("Which operation needs to perform in the below items");
        System.out.println("For addition operation enter -> add");
        System.out.println("For substraction operation enter -> sub");
        System.out.println("For multiplication operation enter -> mul");
        System.out.println("For division operation enter -> div");
        System.out.println("For modulus operation enter -> mod");

        String operation = sc.next();

        switch(operation){
            case "add":
                System.out.println("Performing the Addition operation and result is "+(input1+input2));
                break;

            case "sub":
                System.out.println("Performing the Substraction operation and result is "+(input1-input2));
                break;

            case "mul":
                System.out.println("Performing the Multiplication operation and result is "+(input1*input2));
                break;

            case "div":
                System.out.println("Performing the Division operation and result is "+(input1/input2));
                break;

            case "mod":
                System.out.println("Performing the Modulus operation and result is "+(input1%input2));
                break;
        }
        sc.close();
    }
}
