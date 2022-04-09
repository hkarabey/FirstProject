package working25;

import working20.arr;

public class Task4 {
    public static void main(String[] args) {

    }
    public static int[] reverse(int[]arr){
        int[] result=new int[arr.length];
        int j=0;
        for (int i = arr.length - 1; i >= 0; i--) {
            result[j++]=arr[i];

        }
        return result;
    }
    public static double[] reverse(double[]arr){
        double[] result=new double[arr.length];
        int j=0;
        for (int i = arr.length - 1; i >= 0; i--) {
            result[j++]=arr[i];

        }
        return result;
    }
    public static char[] reverse(char[]arr){
        char[] result=new char[arr.length];
        int j=0;
        for (int i = arr.length - 1; i >= 0; i--) {
            result[j++]=arr[i];

        }
        return result;
    }
    public static String[] reverse(String[]arr){
        String [] result=new String[arr.length];
        int j=0;
        for (int i = arr.length - 1; i >= 0; i--) {
            result[j++]=arr[i];

        }
        return result;
    }
}
