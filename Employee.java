

public abstract class Employee implements Comparable<Employee> {

    @Override
    public int compareTo(Employee o) {
        int postRes = post.compareTo(o.post);
        if (postRes == 0){
            return surName.compareTo(o.surName);
        }
        return postRes;
    }

    /**
     *Должность
     */
    protected String post;

    /**
     * Имя
     */
    protected String name;

    /**
     * Фамилия
     */
    protected String surName;

    /**
     *возраст
     */
    protected int age;

    /**
     * Ставка заработной платы
     */
    protected double salary;

    /**
     * Расчет среднемесячной заработной платы
     * @return заработная плата в месяц
     */
    public abstract double calculateSalary();

    public Employee(String post, String surName, String name, int age, double salary) {
        this.post = post;
        this.surName = surName;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}
