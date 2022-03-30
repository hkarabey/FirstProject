package working17;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("write a number");
        int n1 = scan.nextInt();
        System.out.println("write a second number");
        int n2 = scan.nextInt();

        while (true) {
            if (n1 >= 0 && n2 >= 0) {
                System.out.println(n1 + n2);
                System.out.println("write a positive number");
                n1= scan.nextInt();
                System.out.println("write a second positive number");
                n2= scan.nextInt();
            } else {
                System.out.println("numbers are not positive");
          break;
            }




        }
        scan.close();
    }
}


