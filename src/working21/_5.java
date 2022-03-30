package working21;

import java.util.Arrays;

public class _5 {

    public static void main(String[] args) {

        int[]arr1 = {30, 10, 20};
        int[]arr2 = {15, 40, 25, 35};
        int[]arr3 = {8, 9, 17, 5, 4, 1};

        int[]merge=new int[arr1.length+arr2.length+arr3.length];
int j=0;
        for (int i = 0; i < arr1.length; i++) {
         merge[j]+=arr1[i];
         j++;
        }
        for (int i = 0; i < arr2.length; i++) {
            merge[j]+=arr2[i];
            j++;
        }
        for (int i = 0; i < arr3.length; i++) {
            merge[j]+=arr3[i];
            j++;
        }
        System.out.println(Arrays.toString(merge));
    }

}
