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

    }





}
