package week013.Encapsulatıon;

public class Credentianal {

    private String userName= "A123456";
    private String password="Cydeo123";


    public String getUserName(){
       if (true)
        return this.userName;
       return "conditionan is not satisfy";
    }
    public String getPassword(){
        return this.password;

    }
    public void setPassword(String newPassword){
        if (true)
            this.password=newPassword;
            System.exit(-1);
    }
}
