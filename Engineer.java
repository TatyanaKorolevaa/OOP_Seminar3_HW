

public class Engineer extends Employee {
    private Engineer(String post, String surName, String name, int age, double salary) {
        super(post, surName, name, age, salary);
    }

    public static Engineer create(String post, String surName, String name, int age, double salary){
        return new Engineer(post, surName, name, age, salary);
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
