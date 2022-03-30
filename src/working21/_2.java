package working21;

import working13.İnitial;

public class _2 {
    public static void main(String[] args) {
        int [] number={1,2,3,4,5,6,7,8,9,10};
int oddCount=0;
        int evenCount=0;
        for (int i = 0; i < number.length; i++) {

            if (number[i]%2==0){
                evenCount++;
            }else {
                oddCount++;
            }

        }
        System.out.println(oddCount);
        System.out.println(evenCount);

    }


}
