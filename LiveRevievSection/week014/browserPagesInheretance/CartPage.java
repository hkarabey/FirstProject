package week014.browserPagesInheretance;

public class CartPage extends AmazonHomePage{
    public String buyerInfo;
    public CartPage(String name,String buyerInfo) {
        super(name);
        this.buyerInfo=buyerInfo;
    }
    public void fillInfo(){
        System.out.println("filling the necessery fields with: "+ buyerInfo);
    }
    public void payFor(long cardNumber){
        System.out.println("paying with credit  CARD: "+cardNumber);
    }

}
