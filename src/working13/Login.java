package working13;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("write you user name");
        String userName=scan.next();

        System.out.println("write your password");
        String passWord=scan.next();

        if (userName.equals("Cydeo")&&passWord.equals("WoodenSpoon")){
            System.out.println("logged in");
        }else {
            System.out.println("incorrect user name or password");
        }

        scan.close();
    }



}
