package working28;

import java.util.ArrayList;
import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {


        ArrayList<String> lis1 = new ArrayList<>(Arrays.asList("A", "B", "C"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("D", "E", "F"));
        ArrayList<String> merge = new ArrayList<>();

        for (String each : lis1) {
            merge.add(each);

        }
        for (String each : list2) {
            merge.add(each);
        }
        System.out.println(merge);
    }

}
