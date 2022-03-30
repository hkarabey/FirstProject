package week009;

public class EtsySearch {

    public static void main(String[] args) {

        System.out.println("--starting UI automatıon testing for etsy website");
        openBrowser("chrome");
        navigateToUrl("http://www.etsy.com");
        searchForItem("java");
       if (verifyItemDiyplayed().equalsIgnoreCase("pass")){
           System.out.println("your test case pass");
       }else {
           System.out.println("failed test case scenarıo");
       }


    }

    public static void openBrowser(String browser) {

        System.out.println("launching " + browser + " browser");
    }

    public static void navigateToUrl(String url) {
        System.out.println("navigating to "+url);
    }
public static void searchForItem(String item){
    System.out.println("pass: verify "+item+" exist");
    System.out.println("click on that "+item);
    }
    public static String verifyItemDiyplayed(){
        String result="pass";
        return result;
    }
}
