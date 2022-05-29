package Practice;

public class return_newcharacters {

    public static void main(String[] args) {

        String str = "AABCCD";
        String output = "";

        for (int i = 0; i < str.length(); i++) {


            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                output += ch;

            }

        }
        System.out.println(output);
    }
}