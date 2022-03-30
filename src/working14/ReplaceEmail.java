package working14;

import java.util.Scanner;

public class ReplaceEmail {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("write you email");
        String email = scan.next();

        String new1 = email.substring(0, email.indexOf("_"));
        String new2 = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
        String new3 = email.substring(email.indexOf("@"));

        System.out.println(new2 + "_" + new1 + new3);

        scan.close();
    }


}
