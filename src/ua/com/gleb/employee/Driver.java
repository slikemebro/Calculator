package ua.com.gleb.employee;

public class Driver extends Employee{

    private long money = 0;
    TypeOfTaxi typeOfTaxi;

    public Driver(String name, int age, long salary, int stageOfWork, TypeOfTaxi typeOfTaxi) {
        super(name, age, salary, stageOfWork);
        this.typeOfTaxi = typeOfTaxi;
    }

    @Override
    public void takeSalary() {
        int i = 0;
        if (stageOfWork == 2) i = 1;
        if (stageOfWork == 6) i = 2;
        if (stageOfWork == 8) i = 3;
        money += ((salary + (25000 * i))) * 12;
    }

    @Override
    public double getMoney() {
        return money / 100f;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "money=" + money +
                ", typeOfTaxi=" + typeOfTaxi +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", stageOfWork=" + stageOfWork +
                '}';
    }
}
