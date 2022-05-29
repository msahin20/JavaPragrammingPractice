package Practice;

public class StringMethods_Part1 {
    public static void main(String[] args) {
// charAt (int index): returns the char at given index, return type--->char

        String str = "Cydeo";
        //index:      01234
        char ch1 = str.charAt(2);

        System.out.println(ch1);
        System.out.println("______________");
//length(): returns the total number of characters, return type--->int

        String str2 = "Wooden Spoon";
        int n1 = str2.length();
        System.out.println(n1);

        int lastIndex = str2.length()-1;
        System.out.println("Last Index = " + lastIndex);

        System.out.println("_____________________");
   //toLowerCase(): returns the all lower case  return type...>String

   String str3 = "JavA";
   str3= str3.toLowerCase();
        System.out.println(str3);

        //toUpperCase(): returns the all upper case  return type...>String

        System.out.println("___________________");
//trim(): returns the String without all the white spaces (unused spaces). return type...>String
        String str5 = "           Java           Programming       Language     ";
        str5 =str5.trim();
        System.out.println(str5);
        System.out.println("______________________");

 // indexof():returns the first matching character index number return type...>int

        String str6 = "Wooden Spoon";
        int IndexNumOfFirst_o = str6.indexOf("o");
        System.out.println("IndexNumOfFirst_o = " + IndexNumOfFirst_o);
        int IndexNumOfSecond_o = str6.indexOf("od");
        System.out.println("IndexNumOfSecond_o = " + IndexNumOfSecond_o);
        int IndexNumOfThird_o = str6.indexOf("po") +1;
        System.out.println("IndexNumOfThird_o = " + IndexNumOfThird_o);
        System.out.println("___________________");
      // lastindexof():returns the last matching character index number return type...>int

        int IndexNumOfFourth_o = str6.lastIndexOf("o");
        System.out.println("IndexNumOfFourth_o = " + IndexNumOfFourth_o);
        System.out.println("___________________");
    }
}