package ro.fasttrackit.curs12.homeworkV2.exercise3;

import java.util.*;

public class ListOfEmployees {
    private List<Employee> employeeList = new ArrayList<>();

    public void addEmployee(Employee employee) {
        this.employeeList.add(employee);
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public Map<String, Double> employeesWithSalaryHigherThan(double amount) {
        Map<String, Double> result = new HashMap<>();
        for (Employee employee : this.employeeList) {
            if (employee.getSalary() > amount) {
                result.put(employee.getName(), employee.getSalary());
            }
        }
        return result;
    }

    public Map<String, List<String>> personsFromSpecificCompany(String company) {
        Map<String, List<String>> result = new HashMap<>();
        List<String> names = new ArrayList<>();
        for (Employee employee : this.employeeList) {
            if (employee.getCompany().toLowerCase().equals(company.toLowerCase())) {
                names.add(employee.getName());
            }
        }
        result.put(company, names);
        return result;
    }

    public double sumOfAllSalaries() {
        double sum = 0;
        for (Employee employee : this.employeeList) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private Map<String, List<Employee>> employeesByCompany() {
        Map<String, List<Employee>> result = new HashMap<>();
        for (Employee employee : this.employeeList) {
            if (!result.containsKey(employee.getCompany())) {
                result.put(employee.getCompany(), new ArrayList<>());
            }
            result.get(employee.getCompany()).add(employee);
        }
        return result;
    }

    private double sumOfCompanySalaries(List<Employee> companyEmployees) {
        double sum = 0;
        for (Employee employee : companyEmployees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private Map<String, Double> totalSalariesByCompany() {
        Map<String, List<Employee>> employeesByCompany = employeesByCompany();
        Map<String, Double> result = new HashMap<>();
        for (String key : employeesByCompany.keySet()) {
            result.put(key, sumOfCompanySalaries(employeesByCompany.get(key)));
        }
        return result;
    }

    public Map<String, Double> highestPayingCompany() {
        Map<String, Double> result = new HashMap<>();
        double maxSalary = Collections.max(totalSalariesByCompany().values());
        for (String key : totalSalariesByCompany().keySet()) {
            if (totalSalariesByCompany().get(key) == maxSalary) {
                result.put(key, maxSalary);
            }
        }
        return result;
    }


}
