package week017.interdacedemo;

public class FirefoxDriver implements WebDriver{

    public FirefoxDriver(){
        System.out.println("launching firefox driver");
    }


    @Override
    public void get(String url) {
        System.out.println("firefox driver- navigate to "+url);
    }

    @Override
    public void findElement(String locator) {

        System.out.println(" firefox driver- locating element "+locator);
    }

    @Override
    public void quit() {
        System.out.println("quiting driver - quit");

    }

    @Override
    public String getTitle() {
        return "eu8 automation";
    }

}
