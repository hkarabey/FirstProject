package week01;

public class StringManipulator {

    public String name;
    public int x;

    public StringManipulator(String name,int x){

        this.name=name;
        this.x=x;

    }

    public void firstTwoChars(){
        name=name.substring(0,2);

    }
public String riepaeat(String st){

        return st.substring(st.length()-2).repeat(3);
}

    public String toString() {
        return "StringManipulator{" +
                "name='" + name + '\'' +
                ", x=" + x +
                '}';
    }
}
