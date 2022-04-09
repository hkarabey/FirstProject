package week02;

public class ClassAndObjects {

    /*
          Create a class AnimalSpecies
            - Create these variables in the class:
                 - name (String),
                - population (int - for practice we can consider 1  unit as 1 million. Ex: population = 20 would represent 20 million ),
                - growth rate (int - percent number)

        - Create these methods :
            - setInfo()
                - parameters: name, population, and growth rate
                - returns: void
                - action: assigns the name, population, and growth rate of the object given from the parameters.

        - getName()
             no parameters, returns the name variable

        - getPopulation ()
             no parameters, returns the population variable

        - getGrowthRate()
             no parameters, returns the growth rate variable

        - toString()   generate the toString method as shown in class.

        - Create a class Earth

        - Create AnimalSpecies objects, call  get methods of the objects
     */

    public String name;
    public int populatıon;
    public int growthRate;


    public void setInfo(String name,int populatıon,int growthRate){
        this.name=name;
        this.populatıon=populatıon;
        this.growthRate=growthRate;
    }
    public void getName(){
        System.out.println(name);
    }
    public void getPopulatıon(){
        System.out.println(populatıon);
    }
    public void getGrowthRate(){
        System.out.println(growthRate);
    }

    public String toString() {
        return "ClassAndObjects{" +
                "name='" + name + '\'' +
                ", populatıon=" + populatıon +
                ", growthRate=" + growthRate +
                '}';
    }
}
