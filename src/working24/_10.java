package working24;

import java.util.Arrays;

public class _10 {

    public static void main(String[] args) {

        int[]i={10,20,30,40,50};
        int n=2;
        int[]a=removeElement(i,n);

        System.out.println(Arrays.toString(a));

    }
    public static int[] removeElement(int[]arr,int number){

        int[]result=new int[arr.length-1];

        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if (i==number){
                continue;
            }
            result[j++]=arr[i];
        }
return result;
    }

}
