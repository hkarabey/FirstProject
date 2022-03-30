package week008;

import java.util.Arrays;

public class ArraysUtılıtyExamples {
    public static void main(String[] args) {

        int[]nums={5,10,4,1000,35};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        int[]numsTwo={4,5,10,35,1000};
        boolean equals=Arrays.equals(nums,numsTwo);
        System.out.println(equals);
        System.out.println(nums==numsTwo);//false checking

        int[]numsFour=Arrays.copyOf(nums,nums.length);//index of 0,1
        System.out.println(Arrays.toString(numsFour));
        System.out.println(Arrays.equals(nums,numsFour));
        System.out.println(nums==numsFour);

    }



}
