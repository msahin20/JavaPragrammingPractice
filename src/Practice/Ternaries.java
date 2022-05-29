package Practice;

public class Ternaries {
    public static void main(String[] args) {

        int a =300;
        int b = 200;

        int max = (a>b) ? a :b;  //Finding max number
        System.out.println(max);
        System.out.println("__________________");

        int score = 85;
        char grade2 = (score>=90)? 'A' :(score>=80)? 'B' :(score>=70)? 'C' :(score >= 60)? 'D' : 'F';
        System.out.println(grade2);

        /*
        Ternary:
        ? means if, : menas else

        (Condition)?   : if block
        :(Condition)? :else if block
        :            : Else block

         */
    }
}
