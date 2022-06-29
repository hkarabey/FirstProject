package week020;

public class Calculator {

    public Floor floor;
    public Carpet carpet;

    public Calculator (Floor floor,Carpet carpet){
        this.floor=floor;
        this.carpet=carpet;
    }

    public double getTotalCost(){
        return carpet.getCost()* floor.getArea();
    }

}
