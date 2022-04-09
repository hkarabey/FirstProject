package week013.Inheritance;

public class AmazonShop {

    public static void main(String[] args) {

        AudioBook audioBook=new AudioBook("aw","halil","news",12,12,"child");

        audioBook.listen();
        audioBook.buy();

        System.out.println(audioBook);


    }

}
