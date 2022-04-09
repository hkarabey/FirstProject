package working24;

public class _5 {

    public static void main(String[] args) {

        int[]arrr={1,2,3,4,5,6,1,1,1,2};
        int n=1;
        System.out.println("frequency(arrr,n) = " + frequency(arrr, n));


    }
    public static int frequency(int[]arr,int number){

        int freq=0;
        for (int each : arr) {
            if (each==number){
                freq++;
            }

        }

        return freq;
    }



}
