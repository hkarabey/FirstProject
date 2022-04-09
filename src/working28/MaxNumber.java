package working28;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxNumber {

    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,5,9,6,7));
        int max=list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (max<list.get(i)){
                max=list.get(i);
            }
        }
        System.out.println(max);

    }

}
