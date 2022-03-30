package working2;

import java.util.Locale;
import java.util.Scanner;

public class LoverUpper {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();

        System.out.println("enter a String");
        System.out.println("enter another String");

        String s2 = scan.next();
        System.out.println(s1.toLowerCase() + " " + s2.toUpperCase());

    }


}
