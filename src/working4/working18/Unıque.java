package working4.working18;

public class Unıque {
    public static void main(String[] args) {
        String str="aabccdeef";//bdf

        int frequency;
        String result="";

        for (int i = 0; i < str.length(); i++) {

            char ch=str.charAt(i);
            frequency=0;

            for (int j = 0; j < str.length(); j++) {

                char ch2=str.charAt(j);
                if (ch==ch2){
                    frequency++;

                }
            }
            if (frequency!=1){
                continue;
            }
            result+=ch;

        }
        System.out.println(result);


    }

}
