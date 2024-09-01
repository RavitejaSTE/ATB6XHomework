import java.util.Scanner;

public class ArrayCoding_GetMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects you have");

        int noOfSubject = sc.nextInt();
        System.out.println("Total you have "+noOfSubject+" subjects");

        int[] marks = new int[noOfSubject];
        System.out.println("Enter the marks for each subject");

        for(int i=0; i<marks.length; i++){
            marks[i] = sc.nextInt();
        }

        int totalMarks=0;

        for(int i=0; i<marks.length; i++){
            totalMarks=totalMarks+marks[i];
        }
        System.out.println("Your total marks is "+totalMarks);
        sc.close();
    }
}