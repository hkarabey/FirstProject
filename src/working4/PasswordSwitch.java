package working4;

import java.util.Scanner;

public class PasswordSwitch {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Write your password");
        int password=scan.nextInt();

        switch (password){

            case 1212:
                System.out.println("acces qranted" );
                break;
            case 1213:
                System.out.println("acces qranted");
                break;
            default:
                System.out.println("invalid password");
                break;
        }


    }


}
