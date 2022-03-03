package ua.com.gleb.employee;

public class Doctor extends Employee{
    private long money = 0;

    TypeOfDoctor typeOfDoctor;

    public Doctor(String name, int age, long salary, int stageOfWork, TypeOfDoctor typeOfDoctor) {
        super(name, age, salary, stageOfWork);
        this.typeOfDoctor = typeOfDoctor;
    }

    @Override
    public void takeSalary() {
        int i = 0;
        if (stageOfWork == 2) i = 1;
        if (stageOfWork == 6) i = 2;
        if (stageOfWork == 8) i = 3;
        money += ((salary  + (150000 * i))) * 12;
    }

    @Override
    public double getMoney() {
        return money / 100f;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "money=" + money +
                ", typeOfDoctor=" + typeOfDoctor +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", stageOfWork=" + stageOfWork +
                '}';
    }
}
