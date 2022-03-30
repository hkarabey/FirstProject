package working13;

import java.util.Scanner;

public class StringName {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("write a word");
        String word=scan.next();

        int lenghtOfWord=word.length();
        if (lenghtOfWord>3){
            System.out.println(word.substring(word.length()-3,word.length()));
        }else {
            System.out.println(word);
        }




    }



}
