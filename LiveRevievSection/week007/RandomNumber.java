package week007;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        String source="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";

        System.out.println(source.length());
        String password="";
        Random random=new Random();
        for (int i = 1; i <=8 ; i++) {
            int index= random.nextInt(71);
            System.out.println(index);
            password+=source.charAt(index);


        }
        System.out.println(password);
    }


}
