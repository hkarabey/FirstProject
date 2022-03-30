package working07;

public class VowelOrConsonant {
    public static void main(String[] args) {

        char alphabet = '0';
        if (alphabet>=65&&alphabet<=90||alphabet>=97&&alphabet<=122){
            switch (alphabet){
                case 65:
                case 69:
                case 73:
                case 79:
                case 85:
                    System.out.println("vowel");
                    break;
                case 97:
                case 101:
                case 111:
                case 117:
                    System.out.println("vowel");
                    break;
                default:
                    System.out.println("consonant");
                    break;
            }

        }else{
            System.out.println("invalid character");
        }



    }


}
