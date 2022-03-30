package working4.working18;

public class frequency {
    public static void main(String[] args) {
        String word="aassdfgfdsavcfswerg";
        int frequency=0;
String result="";
        for (int i = 0; i < word.length(); i++) {
            char a=word.charAt(i);
            frequency=0;
            for (int j = 0; j < word.length(); j++) {
                char b=word.charAt(j);
                if(a==b){
                    frequency++;
                }

            }
if (result.contains(""+a)){
    continue;
}
result+=a;
result+=frequency;

        }
        System.out.println(result);


    }



}
