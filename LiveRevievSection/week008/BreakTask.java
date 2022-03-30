package week008;

import java.util.Arrays;

public class BreakTask {
    public static void main(String[] args) {
        // Break time task : capture the amount 790 with split method
        String confirmation = "Id: 2239677\n" +
                "Amount: 790 USD\n" +
                "Card Number: 8548595959595\n" +
                "Name: oscar\n" +
                "Date: 11/10/2021";

        System.out.println("confirmation = " + confirmation);

        String[] arr = confirmation.split("\n");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("790")) {
                System.out.println("index of 790:"+i);

            }

        }
    }
}