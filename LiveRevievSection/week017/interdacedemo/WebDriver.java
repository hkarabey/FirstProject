package week017.interdacedemo;

public interface WebDriver {

    void get(String url);
    void findElement(String locator);
    void quit();
    String getTitle();
}

