package working31.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String owner;
    public String locatıon;
    public int numberOfStars;

    public ArrayList<Server>servers;
    public ArrayList<Chef>chefs;

    public Restaurant(String owner, String locatıon, int numberOfStars) {
        this.owner = owner;
        this.locatıon = locatıon;
        this.numberOfStars = numberOfStars;
        servers=new ArrayList<>();
        chefs=new ArrayList<>();

    }

    public void hireServer(Server server1){
        servers.add(server1);
    }
    public void hireServers(Server[]server){
        servers.addAll(Arrays.asList(server));
    }
    public void hireChef(Chef chef1){
        chefs.add(chef1);
    }
public void hireChefs(Chef[] chef){
        chefs.addAll(Arrays.asList(chef));
}
public void terminateChef(int employeId){
  chefs.removeIf(E->E.employeeID==employeId);
}
public void terminateServer(int serverOfId){
        servers.removeIf(e->e.empoyeeID==serverOfId);
}

    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", locatıon='" + locatıon + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", numberOfServer=" + servers.size() +
                ", numberOfchefs=" + chefs.size() +
                '}';
    }
}
