package working28;

import java.util.ArrayList;
import java.util.Arrays;

public class LastElemetİs0 {

    public static void main(String[] args) {

        ArrayList<Integer> lis = new ArrayList<>();
        lis.addAll(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> converted = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < lis.size()-1; i++) {

            converted.add(lis.get(i));

        }
        converted.add(0);

        System.out.println(converted);
    }
}