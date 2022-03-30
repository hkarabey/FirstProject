package working15;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("WRİTE A WORD");
        String word=scan.nextLine();
        String palin="";
        for (int i = word.length()-1; i >=0 ; i--) {
            palin+=word.charAt(i);

        }
        if (word.equalsIgnoreCase(palin)){
            System.out.println(word+" is palindrome");
        }else {
            System.out.println(word+" is not palindrome");
        }

       scan.close();

    }



}
