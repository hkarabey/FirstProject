package working3;

import java.util.Locale;
import java.util.Scanner;

public class ForScan {
    /*
    What is your name?
    Lucas
    In what year were you born?
    2001
    Lucas, you are 16 and you can drive in the US
  */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What is you name");
        String name=scan.next();
        System.out.println("In what year were you born");
        int year =scan.nextInt();
        int age=2022-year;
        if(age>=18) {
            System.out.println(name.toUpperCase() + " you are " + age + " and you can drive in Turkey");
        }
        else{
            System.out.println(name.toLowerCase() + " you are " + age + " and you can not drive in Turkey");
        }
    }

}
