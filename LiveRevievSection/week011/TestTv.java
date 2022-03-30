package week011;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class TestTv {
    public static void main(String[] args) {

        TV samsung=new TV();
        System.out.println(samsung);

        samsung.turnOn();
        samsung.setChannel(7);
        samsung.setVolume(4);
        System.out.println("samsung = " + samsung);

        TV lg=new TV();
        lg.turnOn();
        lg.setVolume(7);
        lg.setChannel(12);
        System.out.println("lg = " + lg);


        ArrayList<TV>tvlist=new ArrayList<>();

        tvlist.addAll(Arrays.asList(samsung,lg));
        for (TV each :tvlist){
            System.out.println("is tv on"+each.on);
        }

    }




}
