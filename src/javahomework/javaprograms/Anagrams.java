import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first anagram input");
        String input1 = sc.next();
        input1.toLowerCase();
        System.out.println("Enter the second anagram input");
        String input2 = sc.next();
        input2.toLowerCase();

        char [] c1 = input1.toCharArray();
        char [] c2 = input2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        if(Arrays.equals(c1,c2)){
            System.out.println("Both the inputs are Anagrams");
        } else{
            System.out.println("Both the inputs are not Anagrams");
        }
    }
}
