package Lesson4;

import java.util.Objects;

public class Employee implements Comparable{
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "[" + name + ", " + salary + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }

    @Override
    public int compareTo(Object o) {
        Employee employeeForChallange = (Employee) o;
        return this.salary - employeeForChallange.salary;
    }

    //20000 - 10000 = 10000 -> полож :)
    //5000 - 30000 = -25000 -> отриц :(
    //15000 - 15000 = 0 -> нейтр :|

    // -4500000 <=> отр. число - наш объект менее крутой чем тот который передали
    // 0 <=> наш объект равен тому который передали
    // 45000 <=> наш объект круче B)

}
