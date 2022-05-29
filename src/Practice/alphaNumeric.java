package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class alphaNumeric {

    public static void main(String[] args) {
        String str = "murat1454sahin";
        System.out.println(alphaNumeric(str));
    }
    public static String alphaNumeric(String str) {



        String word ="";


        word+=""+str.charAt(0);

        for (int i = 1; i < str.length(); i++) {

            char ch1 = str.charAt(i-1);
            char ch2 = str.charAt(i);
            if ((Character.isLetter(ch1)&Character.isLetter(ch2))||(Character.isDigit(ch1)&Character.isDigit(ch2))){
                word+=""+str.charAt(i);

                continue;
            }else{
                word+=""+" ";
                word+=""+str.charAt(i);
            }


        }
        String[] s = word.split(" ");
        String ouputText="";
        ArrayList<Character> chString=new ArrayList<Character>();
        for (String s1 : s) {

            for (int i = 0; i <s1.length() ; i++) {

                chString.add(s1.charAt(i));
                Collections.sort(chString);


            }

            for (Character each : chString) {
                ouputText+=""+each;

            }
            chString.clear();

        }

        return ouputText;






    }


}
