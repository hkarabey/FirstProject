package working17;

import java.util.Scanner;

public class MathOperator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("write a number");
        int n1=scan.nextInt();
        System.out.println("write a second number");
        int n2= scan.nextInt();
        System.out.println("write a math operator");
        char operator=scan.next().charAt(0);

while(!(operator=='*'||operator=='/'||operator=='+'||operator=='-')){

    System.out.println("write a math operator");
    operator=scan.next().charAt(0);
}
        System.out.println( (operator=='*')?n1*n2:(operator=='/')?n1/n2:(operator=='+')?n1+n2:n1-n2 );



    }

}
