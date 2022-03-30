package week010;

public class İntArray {

    public static void main(String[] args) {
int[] arr={1,2,2,3,4,4,5,7,9,11};
        int a=countEven(arr);
        System.out.println(a);
    }

    public static int countEven(int[]arr){
        int count=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        return count;
    }


}
