package week013.Inheritance;

public class Book {

     String title;
     String author;
     String type;
     double price;

public void buy(){
    System.out.println("buy any books store");
}

    public Book(String title, String author, String type, double price) {
        this.title = title;
        this.author = author;
        this.type = type;
        this.price = price;
    }

    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
