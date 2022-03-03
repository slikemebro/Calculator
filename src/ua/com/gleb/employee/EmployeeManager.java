package ua.com.gleb.employee;

import org.w3c.dom.ls.LSOutput;

public class EmployeeManager {
    public static void main(String[] args) {
        Employee[] emp = new Employee[4];
        emp[0] = new Doctor("Ivan", 40, 4000000, 6, TypeOfDoctor.EMERGENCY_PHYSICIANS);
        emp[1] = new Driver("Vasya", 34, 1500000, 2, TypeOfTaxi.ECONOMIC);
        emp[2] = new Teacher("Tanya", 25, 1200000, 3);
        emp[3] = new Lawyer("Sasha", 30, 1800000, 4);

        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < emp.length; i++) {
                emp[i].takeSalary();
                System.out.println(emp[i].getMoney());
            }
            System.out.println();
        }



    }
}
