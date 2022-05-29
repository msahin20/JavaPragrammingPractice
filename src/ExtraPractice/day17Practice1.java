package ExtraPractice;

public class day17Practice1 {
    public static void main(String[] args) {
        String str = "aabccdeef";
        String out = "";

        for (int i = 0; i <=str.length()-1 ; i++) {
            int count =0;

            for (int j = 0; j <= str.length()-1; j++) {
                if (str.charAt(i)==str.charAt(j)) {
                    count += 1;

                }
            }

            if (count == 1){
                out+= str.charAt(i);
            }

        }
        System.out.println(out);


    }
}
