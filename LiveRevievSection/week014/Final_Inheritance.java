package week014;

import java.util.ArrayList;
import java.util.Arrays;

public class Final_Inheritance {

    public static void main(String[] args) {

        int[]nums={1,2,3};
        nums=new int[]{5,6,7};
        System.out.println(Arrays.toString(nums));

        final ArrayList<String>colors=new ArrayList<>();
        colors.add("orange");
        colors.add("red");
        colors.remove(0);

        // colors=new ArrayList<>();



    }


}
