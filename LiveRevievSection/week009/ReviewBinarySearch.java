package week009;

import week008.ArraysUtılıtyExamples;

import java.util.Arrays;

public class ReviewBinarySearch {

    public static void main(String[] args) {


        int []nums={-4,23,123,654,2344,12345,144423};
       int index1= Arrays.binarySearch(nums,23);//returs index of 23
        System.out.println(index1);

        if(Arrays.binarySearch(nums,2344)>=0){
            System.out.println("2344 is exist");
        }else{
            System.out.println("2344 is not exist");
        }
int[]numTwo={12,4,54,67,123,500,75};
        Arrays.sort(numTwo);
        int index2=Arrays.binarySearch(numTwo,4);
        System.out.println(index2);
        System.out.println(Arrays.binarySearch(numTwo,5));

    }


}
