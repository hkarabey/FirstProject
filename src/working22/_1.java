package working22;

import java.util.Arrays;

public class _1 {
    public static void main(String[] args) {


        int[][]array = { {1,2,3}, {4,5,6}};
        int[][]reverse=new int[2][3];

        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
            for (int i1 = array[i].length - 1,k=0; i1 >= 0; i1--,k++) {
                reverse[j][k]=array[i][i1];
            }
        }

        System.out.println(Arrays.deepToString(reverse));

    }


}
