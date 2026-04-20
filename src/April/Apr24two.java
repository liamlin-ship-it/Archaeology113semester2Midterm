package April;

import java.util.Scanner;

class Employee2{
    final String name;
    int salary;

    Employee2(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public void increaseSalary(int raise){
        if (raise >= 0){
            salary = (int) (salary * (1 + (double) raise / 100));
        }else {
            System.out.println("You cannot increase the salary by a negative amount");
        }
    }

    public String getInfo(){
        return "Name: " + name + ", Salary: " + salary;
    }
}

public class Apr24two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name1 = scanner.nextLine();
        int salary1 = scanner.nextInt();
        int raise1 = scanner.nextInt();
        scanner.nextLine();

        Employee2 emp1 = new Employee2(name1, salary1);
        emp1.increaseSalary(raise1);
        System.out.println(emp1.getInfo());

        String name2 = scanner.nextLine();
        int salary2 = scanner.nextInt();
        int raise2 = scanner.nextInt();

        Employee2 emp2 = new Employee2(name2, salary2);
        emp2.increaseSalary(raise2);
        System.out.println(emp2.getInfo());

        scanner.close();
    }
}
