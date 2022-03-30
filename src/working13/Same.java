package working13;

import java.util.Scanner;

public class Same {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("write a word");
        String word=scan.next();
        char firstCh=word.charAt(0);
        char lastCh=word.charAt(word.length()-1);
        if (firstCh==lastCh){
            System.out.println("same");
        }else {
            System.out.println("Different");}
        scan.close();


    }



}
