package working4;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Write a number");
        int num= scan.nextInt();
        switch (num%2){
            case 0:
                System.out.println(num+" is even");
                break;
            default:
                System.out.println("odd");
                break;
        }

    }

}
