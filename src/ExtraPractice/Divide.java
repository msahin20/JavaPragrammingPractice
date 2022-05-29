package ExtraPractice;

public class Divide {
    public static void main(String[] args) {
        float num1 = 11.5f;
        float num2 = 2.1f;
        float eq =0f;
        float remainder = 0f;

        while (num2<=num1){
        eq +=1;
        num1-=num2;
        remainder= num1;
        }
        System.out.println(eq);
        System.out.println("Remainder " + remainder);
    }
}
