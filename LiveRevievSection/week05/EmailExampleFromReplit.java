package week05;

import java.util.Scanner;

public class EmailExampleFromReplit {
//Write a program that will print out information about user based on email. Print first name, last name, and domain. First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.
//
//        Example:
//
//
//        Input: craig_federighi@apple.com
//
//

//
//        Output:
//        First name: Craig
//        Last name: Federighi
//        Domain: apple
//

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("enter email");
        String email=scan.next();

        String firstNAME=email.substring(0,1).toUpperCase()+email.substring(1,email.indexOf("_")).toLowerCase();
        String lastNAME=email.substring(email.indexOf("_")+1,email.indexOf("_")+2).toUpperCase()+email.substring(email.indexOf("_")+2,email.indexOf("@")).toLowerCase();
        String domain=email.substring(email.indexOf("@")+1,email.indexOf("."));
        System.out.println(firstNAME);
        System.out.println(lastNAME);
        System.out.println(domain);


    }


}
