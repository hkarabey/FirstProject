package working6;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        System.out.println("give week number");
        int number;
        String day="";
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();

        if (number == 1) {
            day = "monday";
        } else if (number == 2) {
            day = "tuesday";
        } else if (number == 3) {
            day = "wednesday";
        } else if (number == 4) {
            day = "thursday";
        } else if (number == 5) {
            day = "friday";
        } else if (number == 6) {
            day = "saturday";
        } else if (number == 7) {
            day = "sunday";

        } else {
            System.out.println("write a valid number");
        }
        System.out.println(day); 
    }
}
