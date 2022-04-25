package working33;

public class Address {

    public String street;
    public String city;
    public String state;
    public int zipCode;

    public static String country,planet;


    public void setInfo(String street, String city, String state, int zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return

               street + "\n"+
               city +" "+

        state +", "+ zipCode
        ;

}
}
