package working31.Restaurant;

public class LocalRestaurant {
    public static void main(String[] args) {

        Restaurant restaurant=new Restaurant("sağıroğlu","salda",5);




        Server[]server={
                new Server("ali",11,12,true),
                new Server("veli",12,13,false)
        };

Chef[]chef={new Chef("yeliz",13,14,true)};

restaurant.hireChefs(chef);
restaurant.hireServers(server);


        System.out.println(restaurant);
    }


}
