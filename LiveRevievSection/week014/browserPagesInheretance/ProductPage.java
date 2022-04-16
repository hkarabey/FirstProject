package week014.browserPagesInheretance;

public class ProductPage extends AmazonHomePage{
    public int quantıty;
    public ProductPage(String name,int quantıty){
        super(name);

        this.quantıty=quantıty;
    }

    public void shopFor(String product){
        super.product =product;
        System.out.println("automatıng "+getName());
        System.out.println("adding quantıty "+quantıty+" amount of "+super.product+" to cart");

    }


}
