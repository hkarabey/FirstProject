package week011;

import week010.İntArray;
import week04.ColorOr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("enter integers (input end with 0)");

        int value;

        do {
            value = input.nextInt();
            if (!list.contains(value) && value != 0) {
                list.add(value);
            }

        } while (value != 0);

        list.add(0);

        System.out.println(list);

        System.out.println("list.size() = " + list.size());

        Collections.sort(list);
        System.out.println("list = " + list);

        int max=Collections.max(list);
        System.out.println("max = "+max);
        int min=Collections.min(list);
        System.out.println("min = " + min);

        Collections.shuffle(list);
        System.out.println(list);

    }


}
