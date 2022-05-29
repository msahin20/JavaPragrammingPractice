package ExtraPractice;

import java.util.Scanner;

public class Divisibleby3_5_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the range for n ");
        int n = input.nextInt();
        String count15 = "Divisible by 15: ";
        String count5 = "Divisible by 5: ";
        String count3 = "Divisible by 3: ";



        for (int i = 1; i <= n; i++) {


            if ((i % 5 == 0) && (i % 3 == 0)) {
                count15 += i + " ";
            } else if ((i % 5 != 0) && (i % 3 == 0)){
                count3 += i + " ";
            } else if ((i % 5 == 0) && (i % 3 != 0)) {
                count5 += i + " ";
            }
        }
            System.out.println(count15);
            System.out.println(count5);
            System.out.println(count3);
    }
}
