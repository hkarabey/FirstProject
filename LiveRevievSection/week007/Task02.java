package week007;

public class Task02 {
    public static void main(String[] args) {
        /*
        1
        10
        101
        1010
        10101
        101010

         */

        int row=6;
        int colomn=6;

        for (row  = 1; row <=6 ; row++) {

            for (colomn = 1;  colomn<=row ; colomn++) {
                System.out.print((colomn%2==0)? 0:1);

            }
            System.out.println();
        }



    }



}
