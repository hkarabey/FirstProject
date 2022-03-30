package working14;

import java.util.Scanner;

public class EmailTask {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("write your email");
        String email=scan.next();

        String n1=email.substring(0,email.indexOf("_"));
        String n2=email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String n3=email.substring(email.indexOf("@")+1,email.indexOf("."));
        System.out.println("first name: "+n1+"\nlast name: "+n2+"\ndomain: "+n3);





    }



}
