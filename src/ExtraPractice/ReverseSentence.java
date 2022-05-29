package ExtraPractice;

import java.util.Arrays;
import java.util.Locale;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "Today is a good day to learn Java";
        String sentence2= "I Love Java";

        String [] splitsentence = sentence.split(" ");
        String [] revsentence = new String[splitsentence.length];
        String [] splitby = sentence2.split(" ");
        System.out.println(Arrays.toString(splitby));
        String word = splitby[1];

        for (int i = word.length()-1; i >=0 ; i--) {
            System.out.print(word.charAt(i));

        }
        System.out.println();





        //System.out.println(Arrays.toString(splitsentence));
        int j = 0;

        for (int i = splitsentence.length - 1; i >= 0; i--, j++) {

            revsentence[j]= splitsentence[i];

        }
        System.out.println(Arrays.toString(revsentence));

    }




}

/*
warmup task:
	1. Write a program that can reverse a sentence
			Ex:
				sentence = "Today is a good day to learn Java";

			output:
				Java learn to day good a is Today
 */