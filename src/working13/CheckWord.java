package working13;

import java.util.Scanner;

public class CheckWord {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("write a word");
        String word1=scan.next();

        System.out.println("write a word");
        String word2=scan.next();

        System.out.println("write a word");
        String word3=scan.next();

        int LoW1=word1.length();
        int LoW2=word2.length();
        int LoW3=word3.length();

        if (LoW1==LoW2&&LoW1==LoW3){
            System.out.println("all length same");
        }
        else if (LoW1!=LoW2&&LoW1!=LoW3){
            System.out.println("all different length");
        }
        else {
            System.out.println("Not same nor different length");
        }

scan.close();
    }


}
