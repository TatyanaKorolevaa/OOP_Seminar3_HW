

import java.util.Random;

public class EmployeeFabric {

    private static Random random = new Random();

    public static Staff generateStaff(){
        String [] post = new String[] { "Рабочий", "Инженер", "Фрилансер"};
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Степан", "Рубен", "Герман", "Игорь", "Илья", "Артём" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов", "Корпусенко", "Смирнов", "Ковалев" };

        int age = random.nextInt(18, 65);
        int salary = random.nextInt(30000, 150001);
        return Staff.create(
            post[random.nextInt(post.length)],
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                age, salary);
    }

    /**
     * TODO: Переработать метод generateEmployees, метод должен генерировать рабочих
     *  разных типов (Worker, Freelancer) в рамках домашней работы
     * @param count
     * @return
     */
    public static Staff[] generateEmployees(int count){
        Staff[] personnel = new Staff[count];
        for (int i = 0; i < count; i++){
            personnel[i] = generateStaff();
        }
        return personnel;
    }

}
