import java.util.Scanner;

public class EvenOddNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        int mod = num;
        if(num%2==0){
            System.out.println("It is a Prime Number");
        } else{
            System.out.println("It is not a Prime Number");
        }
    }
}
