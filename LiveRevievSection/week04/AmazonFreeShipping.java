package week04;

public class AmazonFreeShipping {
    public static void main(String[] args) {
        double totalPrice = 55.50;
        if (totalPrice >= 25) {
            System.out.println("free shiiping is eligible your total price is : $" + totalPrice);
        } else {
            System.out.println("not eligible");
        }
        System.out.println("thank you for shipping with us");

    }


}
