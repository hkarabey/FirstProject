package working14;

import java.util.Scanner;

public class Last2Character {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("write a word");
        String word=scan.next();

        String lastTwo=word.substring(word.length()-2);
        if (lastTwo.equals("ly")){
            System.out.println("really");
            System.out.println(word.charAt(word.length()-1));
            System.out.println(word.length());
        }else {
            System.out.println("newer mind");
        }


scan.close();
    }



}
