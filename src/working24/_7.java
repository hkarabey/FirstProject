package working24;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _7 {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] a2 = {4, 5, 6};
        int[] a3 = merge(a1, a2);
        System.out.println(Arrays.toString(a3));

    }

    public static int[] merge(int[] i1, int[] i2) {
        int[] arr2 = new int[i1.length + i2.length];
        int i = 0;
        for (int each : i1) {
            arr2[i++] = each;
        }
        for (int each : i2) {
            arr2[i++] = each;
        }
        return arr2;
    }


}
