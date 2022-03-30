package working3;

import java.util.Scanner;

public class YesNoUpperCaseScan {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Write a latter");
        String latter= scan.next();
        if (latter.toUpperCase().equals("Y")) {
            System.out.println("YES.");

        }
        else if(latter.toUpperCase().equals("N")){
            System.out.println("NO");


        }else{
            System.out.println("Write a valid latter");
        }



    }




}
