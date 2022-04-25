package working33;

public class IphoneTask {
public String model;
public double price;
public String color;
public String size;

public static String brand;
public static String OS;
public static String madeIn;

static {

    brand="IPhone";
    OS="IOS";
    madeIn="china";
}

    public IphoneTask(String model, double price, String color, String size) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
    }

    public static void faceTime(long phoneNumber){

        System.out.println(phoneNumber+" has faceTime");
    }
    public static void faceTime(String email){
        System.out.println(email+" has face time");
    }
    public static void call(long phoneNumber){
        System.out.println(phoneNumber+" is calling");
    }

    public static void text(long phoneNumber){
        System.out.println(phoneNumber+" is texting");
    }

    public String toString() {
        return "IphoneTask{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
