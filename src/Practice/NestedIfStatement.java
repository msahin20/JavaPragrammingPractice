package Practice;

public class NestedIfStatement {

    public static void main(String[] args) {

        int score = 45;
        if (score >= 0 && score <= 100) {   //Valid Score

            if (score >= 60) {

                System.out.println("Congragulations");
            } else {

                System.out.println("Failed");
            }


        } else {
            System.out.println("Invalid score");
        }

    }
}