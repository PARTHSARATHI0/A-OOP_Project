package single_Responsibility_Principle;

public class Main {
	public static void main(String[] args)
	{
		Employee emp1 = new Employee("Parthsarathi","Manager");
		Employee emp2 = new Employee("Abhinay","Developer");
		
		SalaryCalculator salarycalculator = new SalaryCalculator();
		System.out.println(emp1.getname() + " earns " + salarycalculator.calculateSalary(emp1));
		System.out.println(emp2.getname() +" earns "+salarycalculator.calculateSalary(emp2));
	}

}
