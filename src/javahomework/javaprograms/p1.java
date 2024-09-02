import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        String s1 = "Raviteja";
        String s2 = "Welcome";

        char[] ch = s1.toCharArray();
        for (int i=0; i< ch.length; i++){
            System.out.println("Printing "+i+"th Array value "+ch[i]);
        }

        for (int i=0; i< s2.length(); i++){
            char c = s2.charAt(i);
            System.out.println("Printing "+i+"th char value "+c);
        }

    }
}
