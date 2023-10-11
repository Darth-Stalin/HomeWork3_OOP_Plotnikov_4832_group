package ru.geekbrains.Lesson3;

public class Freelancer extends Employee{

    public Freelancer(String surname, String name, int age, double salary) {
        super(surname, name, age, salary);
    }

    @Override
    public double calculateSalary() {
        return 20.8 * 8 * salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Удаленная работа; %d возраст; Среднемесячная з/п: %.2f (руб)", surname, name, age, calculateSalary());
    }
}
