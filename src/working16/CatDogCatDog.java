package working16;

import java.util.Scanner;

public class CatDogCatDog {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("WRİTE A SENTENCE");
        String sentence = scan.nextLine();
        int cat = 0;
        int dog = 0;
        for (int i = 0; i <= sentence.length() - 3; i++) {
            String cats = sentence.substring(i, i + 3);
            String dogs = sentence.substring(i, i + 3);
            if (cats.equalsIgnoreCase("cat")) {
                cat += 1;
            }
            if (dogs.equalsIgnoreCase("dog")) {
                dog += 1;
            }
        }
        if (dog == cat) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        scan.close();


    }


}
