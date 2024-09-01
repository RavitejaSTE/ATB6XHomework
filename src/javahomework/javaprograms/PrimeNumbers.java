import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer number");
        int num = sc.nextInt();
        if(num<=0){
            System.out.println("Enter a valid number");
        }else if(num==1){
            System.out.println("1 is neither prime nor composite number");
        }else{
            for(int i=2; i<num; i++){
                if(num%i==0){
                    count=1;
                    System.out.println(num+" is not a prime number");
                    break;
                }
            }
            if(count==0){
                System.out.println(num+" is a prime number");
            }
        }
            sc.close();
    }
}
