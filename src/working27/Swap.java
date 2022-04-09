package working27;

import working20.arr;

import java.sql.Array;
import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {

int[]a1={1,2,3,4,5,6,7};
int i=1;
int i1=2;
int[]a2=swap(a1,i,i1);
        System.out.println(Arrays.toString(a2));

    }
    public static int[] swap(int[]arr,int n1,int n2){

        int[] newArr=new int[arr.length];
        int j=0;

        for (int i = 0; i < arr.length; i++) {
            if (j==n1){
                newArr[j++]=arr[n2];
                continue;
            }
            if (j==n2){
                newArr[j++]=arr[n1];
                continue;

            }
            newArr[j++]=arr[i];

        }
return newArr;
    }

    public static double[] swap(double[]arr, int n1, int n2){

        double[] newArr=new double[arr.length];
        int j=0;

        for (int i = 0; i < arr.length; i++) {
            if (j==n1){
                newArr[j++]=arr[n2];
                continue;
            }
            if (j==n2){
                newArr[j++]=arr[n1];
                continue;

            }
            newArr[j++]=arr[i];

        }
        return newArr;
    }

    public static char[] swap(char[]arr,int n1,int n2){

        char[] newArr=new char[arr.length];
        int j=0;

        for (int i = 0; i < arr.length; i++) {
            if (j==n1){
                newArr[j++]=arr[n2];
                continue;
            }
            if (j==n2){
                newArr[j++]=arr[n1];
                continue;

            }
            newArr[j++]=arr[i];

        }
        return newArr;
    }

    public static String[] swap(String []arr,int n1,int n2){

        String [] newArr=new String[arr.length];
        int j=0;

        for (int i = 0; i < arr.length; i++) {
            if (j==n1){
                newArr[j++]=arr[n2];
                continue;
            }
            if (j==n2){
                newArr[j++]=arr[n1];
                continue;

            }
            newArr[j++]=arr[i];

        }
        return newArr;
    }


}
