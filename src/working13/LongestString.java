package working13;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("write a word");
        String w1=scan.nextLine();
        System.out.println("write other word");
        String w2= scan.nextLine();
        int LengtOfW1=w1.length();
        int LenghtOfW2=w2.length();
        if(LengtOfW1>LenghtOfW2){
            System.out.println("Longest word= "+w1);
        }
        else {
            System.out.println("Longest word is= "+w2);

        scan.close();
        }



    }



}
