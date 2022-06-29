package week020;

public class Carpet {

    private double cost;


    public Carpet(double cost){
        setCost(cost);
    }

    public void setCost(double cost) {
        if (cost<0){
            throw new RuntimeException("it is not accessible cost");
        }
        else
            this.cost=cost;
    }

    public double getCost() {
        return cost;
    }
}
