package week018;

public class Father extends Parent implements Worker{
    @Override
    public void raiseKid() {
        System.out.println("raising kid");

    }

    @Override
    public void playWithKid() {
        System.out.println("playing with kid");

    }

    @Override
    public void feedKid() {
        System.out.println("providing food");

    }

    @Override
    public void work(String job) {
        System.out.println(" working as a "+job);

    }

    @Override
    public double getPaid() {
        return 45000;
    }
}
