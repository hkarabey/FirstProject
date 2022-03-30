package working6;

import java.util.Scanner;

public class Sc {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Write a character");
        char ch=scan.next().charAt(0);

        if(ch>=48&&ch<=57||ch>=65&&ch<=90||ch>=97&&ch<=122){
            System.out.println(ch+ " is a character or digit");
        }else{
            System.out.println(ch+" is special character");
            scan.close();
        }



       /* char ch='@';

        if(ch>=48&&ch<=57||ch>=65&&ch<=90||ch>=97&&ch<=122){
            System.out.println(ch+ " is a character or digit");
        }else {
            System.out.println(ch + " is special character");
        }*/


    }
}
