package working13;

import java.util.Scanner;

public class İnitial {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("write a word");
        String w1=scan.next();

        System.out.println("write a word");
        String w2=scan.next();

        System.out.println(w1.toUpperCase().charAt(0)+"."+w2.toUpperCase().charAt(0));




    }



}
