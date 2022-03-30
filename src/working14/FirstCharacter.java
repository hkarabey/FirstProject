package working14;

import java.util.Scanner;

public class FirstCharacter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("write a word");
        String word=scan.next();

        char firstChar=word.charAt(0);

        if (firstChar>=48&&firstChar<=57){
            System.out.println("digit");
        }else if (firstChar>=65&&firstChar<=90){
            System.out.println("upper case");
        }else if (firstChar>=97&&firstChar<=122){
            System.out.println("lower case");
        }




scan.close();
    }





}
