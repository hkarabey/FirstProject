package week010;

import working20.arr;

public class DıfferencebetwenTwoNumbers {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,5,9};
        int a=difference(arr);
        System.out.println(a);
        //ı want to see even numbers

        System.out.println(İntArray.countEven(arr));

    }
    public static int difference(int []arr){
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        int sum=max-min;
        return sum;
    }


}
