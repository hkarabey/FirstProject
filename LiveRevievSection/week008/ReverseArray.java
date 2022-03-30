package week008;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[]nums={5,10,4,1000,1};
        System.out.println("before revese: "+ Arrays.toString(nums));

        for (int i = 0; i < nums.length/2; i++) {

            int tem=nums[i];
            nums[i]=nums[nums.length-1-i];
            nums[nums.length-1-i]=tem;
        }
        System.out.println("after reverse: "+Arrays.toString(nums));
Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }


}
