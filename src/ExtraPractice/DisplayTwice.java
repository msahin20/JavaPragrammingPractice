package ExtraPractice;

public class DisplayTwice {
    public static void main(String[] args) {


        String input = "aabbbaccddef";          //ji
        char output;

        String result= "";

        for (int i = 0; i <= input.length() - 1; i++) {
            if (result.contains(input.charAt(i)+"")){
                continue;
            }

               int counter = 1;
               for (int j = 0; j <= input.length() - 1; j++) {
                   if (i==j){
                       continue;
                   }
                   if (input.charAt(i) == input.charAt(j))  {
                       counter += 1;
                   }
               }
               if (counter == 2){
                   result += input.charAt(i) + " ";

               }

        }
        System.out.println(result);

    }
}