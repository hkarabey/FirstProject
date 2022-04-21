package week014.browserPagesInheretance;

import java.util.Arrays;

public class TestCase {
    public static void main(String[] args) {


        AmazonHomePage amazonHomePage=new AmazonHomePage("chrome");
        System.out.println(amazonHomePage.getName());
        System.out.println(Browser.getOSName());

        amazonHomePage.navigateTo("www.amazon.com");

        amazonHomePage.navigateTo("search for laptops");

        amazonHomePage.shopFor("samsung PC");

        ProductPage productobject=new ProductPage("chrome",2);
        productobject.shopFor(amazonHomePage.product);

        amazonHomePage.navigateTo("cart");

        CartPage cartPage=new CartPage("chrome","ms.smith");

        cartPage.fillInfo();
        cartPage.payFor(1234598065452l);
        System.out.println(cartPage.getName());

        cartPage.closeBrowser();
        cartPage.setName("firefox");
        System.out.println(cartPage.getName());
        System.out.println(amazonHomePage.getName());

    }





}
