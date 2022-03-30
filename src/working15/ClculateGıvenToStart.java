package working15;

import java.util.Scanner;

public class ClculateGıvenToStart {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Write a number");
        int i=scan.nextInt();
        int j=0;
        for (int k = 0; k <=i ; k++) {
            j+=k;

        }

        System.out.print(j);
scan.close();

    }


}
