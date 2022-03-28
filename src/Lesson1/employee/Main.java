package Lesson1.employee;

import Lesson1.employee.Employee;
import Lesson1.employee.EngineerEmployee;
import Lesson1.employee.SalesmanEmployee;

public class Main {

    public static void main(String[] args) {

        SalesmanEmployee employee = new SalesmanEmployee("Slava", 35, 8000);
        employee.setSales(10);
        employee.getBonus();
        employee.getBonus(10000);

        System.out.println(Employee.getCount());


        EngineerEmployee employee2 = new EngineerEmployee("Andrei", 23, 6000);
        employee2.setFixedItems(10);
        employee2.getBonus();
        employee2.getBonus(10000);
        System.out.println(Employee.getCount());

        employee.getTax();

        Object o;

        String s = "Hello";
        System.out.println(employee2);
        System.out.println(s);

        Integer n = 15;
        System.out.println(n);

        String s1 = new String("123");
        String s2 = new String("123");
        System.out.println(s1.equals(s2));


    }
}
