package ExtraPractice;

public class B {
    static int count;

    public B () {
        count++;

    }
}
class Test {
    public static void main(String[] args) {
        new B();
        System.out.println(B.count);
    }
}