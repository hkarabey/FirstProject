package working24;

public class _1 {

    public static void main(String[] args) {
        String sentence="java java java python";
        String word="java";
        int a =frequencyOfWord(sentence,word);
        System.out.println(a);


    }
    public static int frequencyOfWord(String sentence,String word){
        int frequency=0;
        for (int i = 0; i < sentence.length()-word.length(); i++) {
            if (sentence.substring(i,i+word.length()).equals(word)){
                frequency++;
            }

        }
        return frequency;
    }

}
