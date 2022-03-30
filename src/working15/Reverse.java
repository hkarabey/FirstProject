package working15;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Write an any word");
        String word=scan.nextLine();
        String reverse="";
        for (int i = word.length()-1; i >=0 ; i--) {
            reverse+=word.charAt(i);

        }
        System.out.println("reverse = " + reverse);
        scan.close();



    }




}
