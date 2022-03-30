package working17;

import java.io.FilterOutputStream;
import java.util.Scanner;

public class Divisibleby15_3_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("write a number");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                int result = i;
                System.out.print(result + " ");
            }
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                int result = i;
                System.out.print(result + " ");
            }
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                int result = i;
                System.out.print(result + " ");
            }


        }
scan.close();
    }}


