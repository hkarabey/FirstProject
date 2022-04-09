package working27;

public class LettesDigitSpecial {

    public static void main(String[] args) {

    String str="Wooden spoon12!";
    char[]ch= str.toCharArray();

    String digit="";
    String letters="";
    String special="";

        for (int i = 0; i < ch.length; i++) {
            if (Character.isLetter(ch[i])){
                letters+=ch[i];
            }
            if (Character.isDigit(ch[i])){
                digit+=ch[i];
            }
            if (!(Character.isDigit(ch[i])||Character.isLetter(ch[i]))){
                special+=ch[i];
            }

        }
        System.out.println("digits "+digit);
        System.out.println("specials "+special);
        System.out.println("letters "+letters);


    }



}
