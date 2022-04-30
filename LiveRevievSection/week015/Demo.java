package week015;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        try {
            Thread.sleep(5000);

        }catch (Exception e){

        }
        System.out.println("ı will save on my web aoutomation");

        System.out.println("write a second");
        int second= new Scanner(System.in).nextInt();
        for (int i =second; i >=0 ; i--) {
            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }

            System.out.print("\r"+i);

        }
        System.out.println("\rtime is up");
    }

}
