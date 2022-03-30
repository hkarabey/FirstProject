package working14;

import java.util.Scanner;

public class XWithoutCode {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("write a word");
        String word=scan.next();
        char firstLatter=word.charAt(0);
        if (firstLatter=='x'){
            System.out.println(word.substring(1));
        }




      scan.close();

    }


}
