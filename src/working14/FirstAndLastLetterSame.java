package working14;

import java.util.Scanner;

public class FirstAndLastLetterSame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter 2 word");
        String word1 = scan.next();
        String word2 = scan.next();

        char lastChar = word1.charAt(word1.length() - 1);
        char firstChar = word2.charAt(0);
        if (lastChar == firstChar) {
            System.out.println(word1 + word2.substring(1));
        } else {
            System.out.println(word1 + word2);
        }
        scan.close();


    }


}
