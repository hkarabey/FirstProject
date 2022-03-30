package working13;

import java.util.Scanner;

public class Sentense {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("write a senrence");
        String sentence=s.nextLine();
        System.out.println("first char = "+sentence.charAt(0));

        System.out.println("last char= "+sentence.charAt(sentence.length()-1));


    }



}
