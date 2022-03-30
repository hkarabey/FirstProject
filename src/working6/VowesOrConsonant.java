package working6;

import java.util.Scanner;

public class VowesOrConsonant {
    public static void main(String[] args) {
        char chr;
        System.out.println("Write a character");
        Scanner scan = new Scanner(System.in);
        chr = scan.next().charAt(0);

        if (chr >= 65 && chr <= 90 || chr >= 97 && chr <= 122) {

            if (chr == 65 || chr == 69 || chr == 73 || chr == 79 || chr == 85 || chr == 97 || chr == 101 || chr == 105 || chr == 111 || chr == 117) {
                System.out.println("vowel slabel");
            } else {
                System.out.println("consonant slabel");
            }
        } else {
            System.out.println("it is not valid charecter");
        }

    }


}
