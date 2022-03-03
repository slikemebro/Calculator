package ua.com.gleb.employee;

public class Teacher extends Employee{

    private long money;

    public Teacher(String name, int age, long salary, int stageOfWork) {
        super(name, age, salary, stageOfWork);
    }

    @Override
    public void takeSalary() {
        int i = 0;
        if (stageOfWork == 2) i = 1;
        if (stageOfWork == 6) i = 2;
        if (stageOfWork == 8) i = 3;
        money += ((salary + (50000 * i))) * 12;
    }

    @Override
    public double getMoney() {
        return money / 100f;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", stageOfWork=" + stageOfWork +
                ", money=" + money +
                '}';
    }
}
