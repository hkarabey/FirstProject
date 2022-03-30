package week06;

public class EncryptPassWord {
    public static void main(String[] args) {
        /**
         * 5.
         * Given a string password. Encrypt with "x" a given password
         * and print.
         * (do with for loop)
         * password: cydeo
         * encrypt with char :x
         * output:cxyxdxexox
         */
String passWord="cydeo";
char encryptrd='x';
String encryptedPassWord="";
        for (int i = 0; i <passWord.length() ; i++) {
          encryptedPassWord+=""+passWord.charAt(i)+encryptrd;

        }
        System.out.println(encryptedPassWord);


    }


}
