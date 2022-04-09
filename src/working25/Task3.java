package working25;

import working20.arr;

public class Task3 {

    public static void main(String[] args) {


    }
    public static int minNumber(int[]arr){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
    public static byte minNumber(byte[]arr){
        byte min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
    public static short minNumber(short[]arr){
        short min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
    public static long minNumber(long[]arr){
        long min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
    public static float minNumber(float[]arr){
        float min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
    public static double minNumber(double[]arr){
        double min=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}
