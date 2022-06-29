package week017.interdacedemo;

import java.util.concurrent.Callable;

public class DriverObjects {

    public static void main(String[] args) {
ChromeDriver driver1= new ChromeDriver();
FirefoxDriver driver2=new FirefoxDriver();

WebDriver driver3=new ChromeDriver();

driver1.get("www.google.com");
driver1.findElement("//input[@name='q']");
        System.out.println(driver1.getTitle());

    }

}
