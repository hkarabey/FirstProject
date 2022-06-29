package week017.interdacedemo;

public class ChromeDriver implements WebDriver{

    public ChromeDriver(){
        System.out.println("launching chrome driver");
    }


    @Override
    public void get(String url) {
        System.out.println("chrome driver- navigate to "+url);
    }

    @Override
    public void findElement(String locator) {

        System.out.println(" chrome driver- locating element "+locator);
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
