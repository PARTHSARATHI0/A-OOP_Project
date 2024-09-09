package single_Responsibility_Principle;

public class SalaryCalculator {

    public double calculateSalary(Employee employee) {
        switch (employee.getrole()) {
            case "Developer":
                return 80000;
            case "Manager":
                return 100000;
            default:
                return 50000;
        }
    }
}
