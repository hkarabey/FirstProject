package week021;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.*;

public class week21 {

    public static void main(String[] args) {

        Map<String,Object>emp1=new LinkedHashMap<>();

        Map<String,Object>emp2=new LinkedHashMap<>();

        Map<String,Object>emp3=new LinkedHashMap<>();

        emp1.put("first name","steven");
        emp1.put("last name","king");
        emp1.put("job ıd", "add press");
        emp1.put("salary",240_000);
        emp1.put("department ıd",90);

        System.out.println("emp1 = " + emp1);

        emp2.put("first name","halil");
        emp2.put("last name","kara");
        emp2.put("job ıd", "sdet");
        emp2.put("salary",240_000);
        emp2.put("department ıd",91);

        System.out.println("emp2 = " + emp2);

        List<Map<String,Object>> list1= new ArrayList<>();
        list1.addAll(Arrays.asList(emp1,emp2));
        System.out.println("list1 = " + list1);

        int salary=0;
        for (Map<String, Object> eachEmployee : list1) {

            if (eachEmployee.get("first name").equals("halil")){
                System.out.println("you are the best one so your sallary will be increase");
                salary=(int)eachEmployee.get("salary");
            }
        }
        System.out.println("\"halils salary\" = " + salary);


    }
}
