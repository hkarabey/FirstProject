package working19;

public class Q6 {
    public static void main(String[] args) {

        String words = "asdssaaaerrfgvvvvvvvv";//v
        int highestfreq = 0;
        for (int j = 0; j < words.length(); j++) {
            char ch1 = words.charAt(j);

            int count = 0;
            for (int i = 0; i <= words.length() - 1; i++) {
                char ch = words.charAt(i);
                if (ch == ch1) {
                    count++;


                }
            }

            if (count > highestfreq) {
                highestfreq = count;
            }
        }
        String result = "";

        for (int j = 0; j < words.length(); j++) {
            char ch1 = words.charAt(j);

            int count = 0;
            for (int i = 0; i <= words.length() - 1; i++) {
                char ch = words.charAt(i);
                if (ch == ch1) {
                    count++;


                }
            }
if (count==highestfreq&&!result.contains(ch1+""))
    result+=ch1;

        }
        System.out.println(result+" "+highestfreq);

    }
}