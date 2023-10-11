package ru.geekbrains.Lesson3;

public class Worker extends Employee{

    public Worker(String surname, String name, int age, double salary) {
        super(surname, name, age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Постоянная работа; %d возраст; Среднемесячная з/п (фикс): %.2f (руб)", surname, name, age, calculateSalary());
    }
}
