package working27;

import working20.arr;

import java.util.Arrays;

public class İnsert {

    public static void main(String[] args) {
        int[]ar={1,2,3,4,5};
        int i=10;
        int inde=2;
        System.out.println(Arrays.toString(insert(ar, inde, i)));

    }
    public static int[] insert(int[]arr, int number1, int number2){

        int[]newArr=new int[arr.length+1];
        int j=0;
        for (int i = 0; i < arr.length; i++) {

            newArr[j++]=arr[i];

            if (number1==j){
                newArr[j++]=number2;
            }

        }
        return newArr;
    }

    public static double[] insert(double[]arr, int number1, double number2){

        double[]newArr=new double[arr.length+1];
        int j=0;
        for (int i = 0; i < arr.length; i++) {

            newArr[j++]=arr[i];

            if (number1==j){
                newArr[j++]=number2;
            }

        }
        return newArr;
    }

    public static char[] insert(char[]arr, int number1, char number2){

        char[]newArr=new char[arr.length+1];
        int j=0;
        for (int i = 0; i < arr.length; i++) {

            newArr[j++]=arr[i];

            if (number1==j){
                newArr[j++]=number2;
            }

        }
        return newArr;
    }

    public static String[] insert(String []arr, int number1, String number2){

        String []newArr=new String[arr.length+1];
        int j=0;
        for (int i = 0; i < arr.length; i++) {

            newArr[j++]=arr[i];

            if (number1==j){
                newArr[j++]=number2;
            }

        }
        return newArr;
    }

}
