package April;

import java.util.Scanner;

class Employee{
    String name;
    int salary;

    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
}

public class Apr24one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name1 = scanner.next();
        int salary1 = scanner.nextInt();
        Employee emp1 = new Employee(name1, salary1);

        String name2 = scanner.next();
        int salary2 = scanner.nextInt();
        Employee emp2 = new Employee(name2, salary2);

        System.out.println("Name: " + emp1.name + ", Salary: " + emp1.salary);
        System.out.println("Name: " + emp2.name + ", Salary: " + emp2.salary);
    }
}
