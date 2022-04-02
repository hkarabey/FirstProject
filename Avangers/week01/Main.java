package week01;

import java.util.Scanner;

public class Main {
    public static double convertC(String[][] money,String[][] convertionRate) {
        // write your code here
        double amount = Double.parseDouble(money[0][1]);
        double rate = Double.parseDouble(convertionRate[0][1]);
        double amount2 = Double.parseDouble(money[1][1]);
        double rate2 = Double.parseDouble(convertionRate[1][1]);
        double total = (amount*rate)+(amount2*rate2);

        return total;

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println();

        String[][] test_money =
                {
                        {"mark","5"},
                        {"shekel","30.5"},
                };

        String[][] test_convert=
                {
                        {"mark","1"},
                        {"shekel","0.5"},
                };

        double res = Main.convertC(test_money,test_convert);
        System.out.print(res);

    }

}