package working20;

import working01.İf;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class sort {

    public static void main(String[] args) {

        int[] numbers = {2, 3, 9, 65, 1, 5, 10};

        ArrayList<Integer> sort = new ArrayList<>();

        ArrayList<Integer> arrayLis = new ArrayList<>();


        for (int each : numbers) {
            arrayLis.add(each);
        }


        while (arrayLis.size()>0) {
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < arrayLis.size(); i++) {
                if (arrayLis.get(i) < min) {
                    min = arrayLis.get(i);
                }
            }

            sort.add(min);





        }
        System.out.println((sort));
    }
}