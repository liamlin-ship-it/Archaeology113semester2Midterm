package May;

import java.util.Scanner;

class Employee{
    private final String name;
    private int salary;

    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public void increaseSalary(int ratio){
        if (ratio > 0){
            salary = salary + (salary * ratio / 100);
        }else {
            System.out.println("You cannot increase the salary by a negative amount");
        }
    }

    public String toString(){
        return "Name: " + name + ", Salary: " + salary;
    }
}

public class May8two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name1 = scanner.next();
        int salary1 = scanner.nextInt();
        int ratio1 = scanner.nextInt();

        Employee employee1 = new Employee(name1, salary1);
        employee1.increaseSalary(ratio1);
        System.out.println(employee1);

        String name2 = scanner.next();
        int salary2 = scanner.nextInt();
        int ratio2 = scanner.nextInt();

        Employee employee2 = new Employee(name2, salary2);
        employee2.increaseSalary(ratio2);
        System.out.println(employee2);

        scanner.close();
    }
}
