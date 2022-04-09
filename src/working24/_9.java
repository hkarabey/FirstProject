package working24;

public class _9 {
    public static void main(String[] args) {

    int []a1={1,2,3,4,5,6,7,8,9,0};
    int n=10;
    boolean er=isContains(a1,n);
        System.out.println(er);

    }
    public static boolean isContains(int[]arr,int number){
        boolean re=false;
        for (int i = 0; i < arr.length; i++) {
        if (arr[i]==number){
            re=true;
            break;
        }
        else {
            re=false;
        }
        }

     return re;
    }



}
