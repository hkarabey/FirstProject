package working15;

import java.util.Scanner;

public class lettersDigitsChars {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Write a any single word");
        String word=scan.next();
        String digit="";
        String letter="";
        String specialChar="";
        for (int i = 0; i <=word.length()-1 ; i++) {

            if (word.charAt(i)>='0'&&word.charAt(i)<='9'){
                digit+=word.charAt(i);
            }
            else if (word.charAt(i)>='a'&&word.charAt(i)<='z'||word.charAt(i)>='A'&&word.charAt(i)<='Z'){
                letter+=word.charAt(i);
            }
            else{
                specialChar+=word.charAt(i);
            }
        }
        System.out.println("digit = " + digit);
        System.out.println("letter = " + letter);
        System.out.println("specialChar = " + specialChar);

        scan.close();

    }



}
