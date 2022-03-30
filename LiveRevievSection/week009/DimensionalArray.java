package week009;

import java.sql.Array;
import java.util.Arrays;

public class DimensionalArray {
    public static void main(String[] args) {
        int[][] arr = {{3, 12, 3, 34, 35, 11}, {13, 7, 456, 34, 3}, {-5, -24, -2, -10, -4}};
        //find the biggest in each array and store ıt ın one d array

        //ı want to print
        System.out.println(Arrays.deepToString(arr));

        int[] biggestNumbers = new int[arr.length];


        for (int i = 0; i < arr.length; i++) {
            int biggest = arr[i][0];
            for (int j = 0; j < arr[i].length; j++) {
                if (biggest < arr[i][j]) {
                    biggest = arr[i][j];
                    biggestNumbers[i] = biggest;
                }
            }

        }

        System.out.println(Arrays.toString(biggestNumbers));
    }


}
