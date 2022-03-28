package Lesson3;

import java.util.Arrays;

public class MyArray<T extends Employee> implements MyInterface<T> {
    T array[];
    int size;
    int indexOfElement = 0;

    public MyArray() {
        array = (T[]) new Object[5];
        size = 5;
    }

    public MyArray(int size) {
        array = (T[]) new Object[size];
        this.size = size;
    }

    public T[] getArray() {
        return array;
    }

    public int getSize() {
        return indexOfElement;
    }

    public boolean checksSize(MyArray<?> arrayToCompare) {
        return this.getSize() > arrayToCompare.getSize();
    }

    public void add(T obj) {
        if (indexOfElement+1 < size) {
            array[indexOfElement] = obj;
            indexOfElement++;
        }
        else {
            array = Arrays.copyOf(array, size + 10);
            size += 10;
            array[indexOfElement] = obj;
            indexOfElement++;
        }
    }

    public T get(int index) {
        return array[index];
    }

    public void getSalaryForAllPeople() {
        if (this.getSize() > 0) {
            System.out.println(this.getSize() * array[0].getSalary());
        }
    }

}
