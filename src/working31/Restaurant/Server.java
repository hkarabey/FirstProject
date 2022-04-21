package working31.Restaurant;

public class Server {

public String name;
public int empoyeeID;
public double hourlyRate;
public boolean fullTime;

    public Server(String name, int empoyeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.empoyeeID = empoyeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public void takeOrder(){
        System.out.println(name+" is taking ana order");
    }
    public void cleanTable(){
        System.out.println(name+" is cleaning the table");
    }

    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", empoyeeID=" + empoyeeID +
                ", hourlyRate=" + hourlyRate +
                ", isfullTime=" +( (fullTime)?"full-time":"part-time") +
                '}';
    }
}
