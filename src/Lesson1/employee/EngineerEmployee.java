package Lesson1.employee;

public class EngineerEmployee extends Employee implements MotivationSystem {

    private int fixedItems;

    public EngineerEmployee(String name, int age, int salary) {
        super(name, age, salary);
        this.setProfession("Engineer");
        System.out.println("Работник создан в системе");
    }

    public int getFixedItems() {
        return fixedItems;
    }

    public void setFixedItems(int fixedItems) {
        this.fixedItems = fixedItems;
    }

    @Override
    public void getBonus() {

    }

    @Override
    public void getBonus(int extraBonus) {

    }

    @Override
    public String toString() {
        return "["+ this.getName() + ", " + this.getAge() + "]";
    }


}
