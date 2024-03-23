

/**
 * Фрилансер (работник с почасовой оплатой)
 * TODO: Доработать в рамках домашней работы
 */

public class Freelancer extends Employee{

    private Freelancer(String post, String surName, String name, int age, double salary) {
        super(post, surName, name, age, salary);
    }

    public static Freelancer create(String post, String surName, String name, int age, double salary){
        return new Freelancer(post, surName, name, age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s; возраст: %d; ставка: %.2f руб.; заработная плата: %.2f руб.",
        post, surName, name, age, salary, calculateSalary());
    }
}
