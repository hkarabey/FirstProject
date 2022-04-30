package week016;

public class Running extends Abstrac{


    @Override
    public void performs() {
        System.out.println("performing running exercise on the track");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return 0;
    }


}
