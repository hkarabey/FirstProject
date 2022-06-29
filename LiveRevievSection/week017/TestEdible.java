package week017;

public class TestEdible {

    public void main(String[] args) {

        Object [] objects={ new Tiger(), new Chicken(),new Apple()};


    }

    interface Edible {
        public abstract String howToEat();
    }

    abstract class Animal {

        public abstract String sound();
    }

    class Chicken extends Animal implements Edible {

        @Override
        public String howToEat() {
            return "Chicken: Fry in";
        }

        @Override
        public String sound() {
            return "gıdak";
        }
    }
    class Tiger extends Animal{

        @Override
        public String sound() {
            return "huu";
        }
    }
    abstract class Fruit implements Edible{

    }
    class Apple extends Fruit{


        @Override
        public String howToEat() {
            return "make apple cider";
        }
    }

    class Orange extends Fruit{

        @Override
        public String howToEat() {
            return "make orange juice";
        }
    }


}
