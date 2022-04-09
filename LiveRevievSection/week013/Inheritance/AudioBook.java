package week013.Inheritance;

public class AudioBook extends Book{

    int length;
    String narrotor;

    public AudioBook(String title, String author, String type, double price, int length, String narrotor) {

        super(title, author, type, price);
        this.length = length;
        this.narrotor = narrotor;
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ",length=" + length +
                ",narrotor='" + narrotor + '\'' +
                '}';
    }

    public void listen(){
        System.out.println("listening to audio book");

        System.out.println("length = " + length);
        System.out.println("type = " + type);
        System.out.println("author = " + author);
        System.out.println("title = " + title);
        System.out.println("narrotor = " + narrotor);


    }


}
