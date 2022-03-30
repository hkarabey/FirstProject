package working20;

import com.sun.tools.javac.Main;

import java.util.Arrays;

public class Q6 {

    public static void main(String[] args) {

        int[] zero = {10, 0, 5, 0, 1, 0};

        int[] newzoreo = new int[zero.length];

int j=0;


            for (int i = 0 ; i < zero.length; i++) {
                if (zero[i] != 0) {
                    newzoreo[j++]  =zero[i] ;
                }

        }
        System.out.print(Arrays.toString(newzoreo));

    }
}