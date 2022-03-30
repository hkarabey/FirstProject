package week007;

public class Task01 {
    /*
    1
    2 6
    3 7 10
    4 8 11 13
    5 9 12 14 15
     */
    public static void main(String[] args) {
        int row=5;
        int colomns=5;


        for (row = 1; row <=5 ; row++) {
            int value=row;


            for ( colomns = 1; colomns <=row ; colomns++) {
                System.out.print(value+" ");
value+=row-colomns;

            }
            System.out.println();





        }



    }




}
