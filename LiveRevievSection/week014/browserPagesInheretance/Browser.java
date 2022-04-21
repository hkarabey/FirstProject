package week014.browserPagesInheretance;

public class Browser {

    private static String browserType;//chrome,safari...

    private static String operatingSystem;//windows,android,ıos

    public Browser(String name){
        browserType=name;
    }

    static {
        operatingSystem="windows";

    }
    public String getName(){

        return browserType;
    }

    public void closeBrowser(){
        browserType=null;
    }
    public void setName(String name){
        if(browserType==null){
            this.browserType=name;
        }
        else{
            System.out.println("there is already an open browser: "+browserType);

        }




    }
    public static String getOSName(){
        return operatingSystem;
    }




}
