package working13;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Write a word");
        String word=scan.next();
        int LengthOfWord=word.length();

        if(LengthOfWord>5){
            System.out.println("word is too short");
        }else if (LengthOfWord<5){
            System.out.println("word is too long");
        }else{
            System.out.println(word);
        }


scan.close();




    }



}
