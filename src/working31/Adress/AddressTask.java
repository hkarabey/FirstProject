package working31.Adress;

public class AddressTask {
    public int buildingNumber;
    public String street;
    public String city;
    public String state;
    public int zipCode;


    public String toString() {
        return
                buildingNumber +" "+
               street +"\n"+
                 city +" "+
                state +
                ", " + zipCode ;

    }
}
