package working20;

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {

        int[] scores={1,2,3,4,5};
        int []reversed=new int[scores.length];

        for (int i = scores.length-1 ,j=0 ; i >=0; i--,j++) {
            reversed[j]=scores[i];


        }
        System.out.println(Arrays.toString(reversed));


    }


}
