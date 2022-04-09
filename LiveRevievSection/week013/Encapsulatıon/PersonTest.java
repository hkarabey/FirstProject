package week013.Encapsulatıon;

public class PersonTest {
    public static void main(String[] args) {


        Person personOne = new Person("mike", "smith", 23);

        System.out.println(personOne);
        personOne.setFirstName("ali");

        System.out.println(personOne.getFirstName());


    }

}
