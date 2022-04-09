package working24;

import java.util.Arrays;

public class _6 {

    public static void main(String[] args) {

            int []arr ={1,2,3,4};
            int nu=5;
            int[]arr2=addElement(arr,nu);
            System.out.println(Arrays.toString(arr2));


    }
    public static int[] addElement(int[]a1, int a){

            int[]a2=new int[a1.length+1];
            int i=0;
            for (int each : a1) {
                    a2[i++]=each;
            }
            a2[i]=a;

            return a2;

    }


}
