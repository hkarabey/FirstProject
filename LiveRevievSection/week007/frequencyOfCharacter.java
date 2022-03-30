package week007;

public class frequencyOfCharacter {
    public static void main(String[] args) {
        String str = "aabcccd";
        String result = ""; //a2b1c3d1

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char d = str.charAt(j);
                if (c == d) {
                    count++;
                }

            }
            if (result.contains("" + c)) {
                continue;
            }
            result += c;
            result += count;
        }
        System.out.println(result);

    }


}
