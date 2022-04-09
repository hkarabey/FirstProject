package working28;

import java.util.ArrayList;
import java.util.Arrays;

public class MinNumber {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,0,-5,8,9));
        int min=list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (min>list.get(i)){
                min=list.get(i);
            }
        }

        System.out.println(min);

    }



}
