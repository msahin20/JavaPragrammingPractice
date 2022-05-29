package ExtraPractice;

import java.util.Scanner;

public class SumofNumbersEntered {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int sum = 0;
        String str = "";

        while (true) {
            System.out.println("Enter a number to add:");
            int num = input.nextInt();
            if (num<0) {
                break;
            }
            sum+= num;
            str+=num + "+";
        }
        str = str.substring(0,str.length()-1);
        System.out.println("The sum of the numbers " + str +" is: " +sum);
        //        System.out.println(str);
    }
}
