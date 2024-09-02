public class StringDuplicateRemoval {
    public static void main(String[] args) {
        String str1 = "HelloWorld"; //HeloWrd
        String str2 = "";

        /*char[] ch = str1.toCharArray();

        for(int i=0; i<str1.length(); i++){
                boolean flag = false;
            for(int j=i+1; j<str1.length();j++){
                if(ch[i]==ch[j]){
                    flag = true;
                    break;
                }
            }
            if(!flag) str2 +=ch[i];
        }
        System.out.println(str2);*/


        for (int i=0; i< str1.length(); i++) {
           char c = str1.charAt(i);
            if (str2.indexOf(c) == -1) { //HelloWorld
                str2 = str2 + c;
            }
        }
            System.out.println(str2);
    }
}
