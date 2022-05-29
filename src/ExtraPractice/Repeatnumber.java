package ExtraPractice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Repeatnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int countpositive = 0;
        int countnegative =0;
        System.out.println("Enter number for 5 times");
        for (int i = 1; i <=5 ; i++) {

            int num = input.nextInt();
            if (num>0){
                countpositive+=1;

            }else if (num<0) {
                {

                    countnegative += 1;
                }

            }
        }
            System.out.println(countpositive + " positive " + countnegative + " negative");

        System.out.println("------------------");
        System.out.println("Enter a string: ");

        String str = input.next() + input.nextLine();
        //str = "Java Programming";
        System.out.print("Enter the char: ");
        String strforchar = input.next();
        char ch = strforchar.charAt(0);
        int count = 0;

        for (int i = 0; i < str.length()-1; i++) {

            if (ch == str.charAt(i)){
                count+=1;

            }

        }
        System.out.println(ch);
        System.out.println(str);
        System.out.println(count);
    }
}

