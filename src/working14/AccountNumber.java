package working14;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("write a number");
        String accountNumber = scan.next();
        char firstNumber = accountNumber.charAt(0);

        if (firstNumber == '2') {
            System.out.println("account number 7 digit");
        } else if (firstNumber == '5') {
            System.out.println("Account number 10 digits");
        } else {
            System.out.println("invalid account number");
        }


        scan.close();

    }


}
