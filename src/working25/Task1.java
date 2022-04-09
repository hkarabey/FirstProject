package working25;

public class Task1 {

    public static void main(String[] args) {

    }

    public static int[] merge(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];
        int i = 0;
        for (int each : a1) {
            result[i++] = each;
        }
        for (int each : a2) {
            result[i++] = each;
        }
        return result;
    }
    public static double[] merge(double[] a1, double[] a2) {
        double[] result = new double[a1.length + a2.length];
        int i = 0;
        for (double each : a1) {
            result[i++] = each;
        }
        for (double each : a2) {
            result[i++] = each;
        }
        return result;
    }
    public static char[] merge(char[] a1, char[] a2) {
        char[] result = new char[a1.length + a2.length];
        int i = 0;
        for (char each : a1) {
            result[i++] = each;
        }
        for (char each : a2) {
            result[i++] = each;
        }
        return result;
    }
    public static String[] merge(String[] a1, String[] a2) {
        String [] result = new String[a1.length + a2.length];
        int i = 0;
        for (String each : a1) {
            result[i++] = each;
        }
        for (String each : a2) {
            result[i++] = each;
        }
        return result;
    }

}
