import java.util.Arrays;
import java.util.Scanner;
class Main {

    public static void add_to_r(int[] r,int n) {
        //create new array with one more position.
        int []arr2=new int[r.length+1];

        for(int j=0,i=0;j<=arr2.length-2;j++,i++){
            arr2[j]=r[i];
        }
        arr2[arr2.length-1]=n;

        System.out.println(Arrays.toString(arr2));




    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt(), n = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ; i <=size-1; i++){
            arr[i]=inp.nextInt();
        }

        add_to_r(arr, n);

    }
}