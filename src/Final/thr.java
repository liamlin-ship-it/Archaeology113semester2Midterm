package Final;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class thr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<HashMap<String, String>> records = EmployeeCollector.getInputData(scanner, 5);

        // Get the department name and salary level from the user
        String departmentName = scanner.next();
        String salaryLevel = scanner.next();

        scanner.close();

        // Create an instance of EmployeeAnalyzer and filter records
        EmployeeAnalyzer analyzer = new EmployeeAnalyzer(records);
        ArrayList<String> names = analyzer.filterRecords(departmentName, salaryLevel);

        // Print the names of employees with the specified salary level in the specified department
        if (names.isEmpty()) {
            System.out.println("Not found");
        } else {
            for (String name : names) {
                System.out.println(name);
            }
        }
    }
}

class EmployeeCollector {
    // Static method to get input data from the user
    public static ArrayList<HashMap<String, String>> getInputData(Scanner scanner, int numberOfRecords) {
        ArrayList<HashMap<String, String>> records = new ArrayList<>();
        for (int i = 0; i < numberOfRecords; i++) {
            HashMap<String, String> record = new HashMap<>();
            String name = scanner.next();
            String department = scanner.next();
            String salaryLevel = scanner.next();
            record.put("name", name);
            record.put("department", department);
            record.put("salaryLevel", salaryLevel);
            records.add(record);
        }
        return records;
    }
}

class EmployeeAnalyzer {
    private final ArrayList<HashMap<String, String>> records;

    // Constructor to initialize records
    public EmployeeAnalyzer(ArrayList<HashMap<String, String>> records) {
        this.records = records;
    }

    public ArrayList<String> filterRecords(String departmentName, String salaryLevel){
        ArrayList<String> result = new ArrayList<>();

        for (HashMap<String, String> record : records) {
            String currentDept = record.get("department");
            String currentSalary = record.get("salaryLevel");

            if (currentDept.equals(departmentName) && currentSalary.equals(salaryLevel)){
                result.add(record.get("name"));
            }
        }
        return result;
    }
}
