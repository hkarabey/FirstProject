package week05;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter a name");
        String name = scan.next();
        String result = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            result += name.charAt(i);

        }
        if (name.equals(result)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }


        scan.close();

    }


}
