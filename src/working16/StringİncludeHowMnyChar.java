package working16;

import java.util.Scanner;

public class StringİncludeHowMnyChar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("write a sentence");
        String sentence=scan.nextLine();
        System.out.println("write a character");

        String ch=scan.next();
        int number=0;
        for (int i = 0; i < sentence.length(); i++)
            if (ch.equalsIgnoreCase(String.valueOf(sentence.charAt(i)))) {
                number+=1;
            }
        System.out.println(number);

      scan.close();
    }


}
