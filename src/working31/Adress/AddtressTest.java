package working31.Adress;

import working31.Adress.AddressTask;

public class AddtressTest {
    public static void main(String[] args) {

        AddressTask adress=new AddressTask();
        adress.buildingNumber=7925;
        adress.street="Johns Branch Dr";
        adress.city="McLean";
        adress.state="Va";
        adress.zipCode=22012;
        System.out.println(adress);


    }
}
