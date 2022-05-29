package Practice;

import java.util.Locale;

public class day16Practice_repeatingWordsSame {
    public static void main(String[] args) {


        String sentence = "caT dog dogG cAt";
        sentence = sentence.toLowerCase();
        String word1 = "cat";
        String word2= "dog";
        String wordNew1 = "";
        String wordNew2 = "";
        int inc1 = 0;
        int inc2 = 0;

        for (int i = 0; i <= sentence.length()-1 ; i++) {

            wordNew1+= sentence.charAt(i);
            if (wordNew1.contains(word1)) {
                inc1 += 1;
                wordNew1= "";
            }
            if (wordNew1.contains(word2)) {
                    inc2 += 1;
                    wordNew1="";
            }

            }
        System.out.println(inc1==inc2);
        }


    }
