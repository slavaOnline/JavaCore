package Lesson1.employee;

public class SalesmanEmployee extends Employee implements DemotivationSystem, MotivationSystem {

    private int sales;


    public SalesmanEmployee(String name, int age, int salary) {
        super(name, age, salary);
        this.setProfession("Salesman");
        System.out.println("Работник создан в системе");
    }

    @Override
    public void getBonus() {
        System.out.println(this.getSalary() + (sales * 4000));
    }

    @Override
    public void getBonus(int extraBonus) {
        System.out.println(this.getSalary() + (sales * 4000) + extraBonus);
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    @Override
    public void getTax() {
        System.out.println("Minus 10k");
    }
}
