package week014.browserPagesInheretance;

public class AmazonHomePage extends Browser{
public String product;
    public AmazonHomePage(String name) {
       super(name);
    }
    public void navigateTo(String Link){

        System.out.println("navigating to "+Link+" USİNG "+super.getName());
    }

    public void shopFor(String product){
        this.product=product;
        System.out.println("navigate to "+this.product+" 's page");
    }

}
