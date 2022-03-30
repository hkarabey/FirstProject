package working16;

import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("write a sentence");
String word=scan.nextLine();
int count=0;

    for (int i = 0; i <= word.length()-4; i++) {
String str=word.substring(i,i+4);
if (str.equalsIgnoreCase("java")){
    count++;
}


    }


        System.out.println(count);
        scan.close();


    }



}
