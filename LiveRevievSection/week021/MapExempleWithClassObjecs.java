package week021;

import week012.Employee;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapExempleWithClassObjecs {

    public static void main(String[] args) {

        Map<String,Object>cydeo=new LinkedHashMap<>();

        Employee emp1=new Employee("Steven","sdet",12,120_000);

        cydeo.put("employeeone",emp1);

        System.out.println("cydeo = " + cydeo);


    }


}
