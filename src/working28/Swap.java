package working28;

import java.util.ArrayList;
import java.util.Arrays;

public class Swap {

    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer>swaped=new ArrayList<>();
        swaped.add(list.get(list.size()-1));

        for (int i = 1; i < list.size()-1; i++) {
       swaped.add(list.get(i));
        }
        swaped.add(list.get(0));
        System.out.println(swaped);
    }

}
