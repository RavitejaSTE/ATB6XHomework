public class ArrayMaxSalary {
    public static void main(String[] args) {

        int[] sal = {30,50,60,90,10,100,999};
        int maxSal=0;
        for(int i=0; i<sal.length; i++) {

            for (int j = 1; j < sal.length; j++) {

                if (sal[i] < sal[j]) {
                    maxSal = sal[j];
                }
            }
        }
        System.out.println("Max value of an array is "+maxSal);
    }
}
