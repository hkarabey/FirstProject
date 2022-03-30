package week04;

public class VendingNestedİf {
    public static void main(String[] args) {
        //drink-snack tea-cafe cips-candy
        String selection = "drink";
        String drinkItem = "tea";
        String snackItem = "candy";
        if (selection == "drink") {
            System.out.println("select your drink");
            if (drinkItem == "tea") {
                System.out.println("tea");
            } else {
                System.out.println("cafe");
            }
        } else if (selection == "snack") {
            System.out.println("select your snack");
            if (snackItem == "candy") {
                System.out.println("candy");
            } else {
                System.out.println("cips");
            }
        } else {
            System.out.println("invalid selection");
        }

    }

}
