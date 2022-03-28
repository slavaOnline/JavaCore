package Lesson1.employee;

public abstract class Employee extends Human {
    private String name;
    private String profession;
    private int age;
    private int salary;
    private static int count = 0;

    //public -> protected -> default -> private

    //public -> из любой точки программы
    //protected -> из одного package или наследники
    //default -> только из одного package
    //private -> только внутри класса

    Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}




