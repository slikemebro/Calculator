package ua.com.gleb.employee;

public class Employee {
    String name;
    int age;
    long salary;
    int stageOfWork;
    private long money = 0;

    public Employee(String name, int age, long salary, int stageOfWork) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.stageOfWork = stageOfWork;
    }

    public void takeSalary(){
        money += salary * 12;
    }



    // getter, setter, equals, toString -->


    public double getMoney() {
        return money / 100f;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", stageOfWork=" + stageOfWork +
                ", money=" + money +
                '}';
    }
}
