package ro.fasttrackit.curs12.homeworkV2.exercise3;

public class Main {
    public static void main(String[] args) {
        ListOfEmployees employeeList = new ListOfEmployees();
        employeeList.addEmployee(new Employee("Mark", 26, "brown", "nestle", 2575.42));
        employeeList.addEmployee(new Employee("Ion", 37, "bald", "google", 3504));
        employeeList.addEmployee(new Employee("Vasile", 54, "grey", "amazon", 1758));
        employeeList.addEmployee(new Employee("Ana", 26, "black", "apple", 1987));
        employeeList.addEmployee(new Employee("Mara", 37, "blond", "nestle", 2000.98));
        employeeList.addEmployee(new Employee("Max", 39, "brown", "apple", 2900));
        employeeList.addEmployee(new Employee("Rares", 44, "black", "amazon", 1388));
        employeeList.addEmployee(new Employee("Renata", 26, "brown", "tesla", 4598));

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(employeeList.getEmployeeList());
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(employeeList.employeesWithSalaryHigherThan(3000));
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(employeeList.personsFromSpecificCompany("amazon"));
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(employeeList.personsFromSpecificCompany("apple"));
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(employeeList.sumOfAllSalaries());
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(employeeList.highestPayingCompany());

    }
}
