package working08;

import java.util.Scanner;

public class SppedCheck {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter current speed");
        int currentSpeed = scan.nextInt();
        int overLimit = currentSpeed - 55;
        if (currentSpeed >= 0) {
            if (currentSpeed >= 55) {
                System.out.println("you are diriving " + overLimit + " km over the limit slow down!");
            } else {
                System.out.println("have a nice trip");
            }
        }
scan.close();
    }


}
