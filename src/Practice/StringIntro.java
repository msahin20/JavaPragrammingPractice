package Practice;

public class StringIntro {
    public static void main(String[] args) {
//Creating String object by String Literal:
        String str1= "Java";
        String str2= "Java";
        String str3= "Java";

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        System.out.println(str1==str2);
        System.out.println(str2==str3);

        System.out.println("______________________________");

        // Creating String object by new keyboard

String s1 = new String("Java");
String s2 = new String ("Java");

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1==s2);

        System.out.println("________________");

        String name = "wooden spoon"; //immutable cant be changed

        name.toUpperCase();  // will not make upper case
        System.out.println(name);
        System.out.println("________________");

        name = name.toUpperCase();
        System.out.println(name);

    }
}
