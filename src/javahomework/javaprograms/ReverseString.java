public class ReverseString {
    public static void main(String[] args) {

        String str1 = "Raviteja";
        String str2 = "";
        char ch = 0;
        for(int i=0; i<str1.length(); i++){

            ch = str1.charAt(i);
            str2=ch+str2;
        }
        System.out.println(str2);

       /* for(int i=str1.length()-1; i>=0; i--){

            str2+=str1.charAt(i);
        }
        System.out.println(str2);*/

    }
}
