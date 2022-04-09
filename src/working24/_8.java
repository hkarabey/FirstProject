package working24;

import java.util.Arrays;

public class _8 {

    public static void main(String[] args) {
        int[]a1={10,20,30,40};
        int[]a2=reverse(a1);
        System.out.println(Arrays.toString(a2));



    }
    public static int[] reverse(int[] arr){
        int[]rev=new int[arr.length];
        int j=0;
        for (int i = arr.length - 1; i >= 0; i--) {
            rev[j++]=arr[i];
        }
        return rev;
    }


}
