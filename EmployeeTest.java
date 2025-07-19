package lab07;

public class EmployeeTest {
	    public static void main(String[] args) {
	        // Create employees
	        Employee emp1 = new Employee("Alice", 3000);
	        Employee emp2 = new Employee("Bob", 3500);

	        // Display yearly salary
	        System.out.println("Initial Yearly Salaries:");
	        displaySalary(emp1);
	        displaySalary(emp2);

	        // Show total salary
	        System.out.printf("Total yearly salary of all employees: $%.2f%n%n", Employee.getTotalSalary());

	        // Apply 10% raise
	        emp1.increaseSalary(10);
	        emp2.increaseSalary(10);

	        // Display updated salary
	        System.out.println("Yearly Salaries After 10% Raise:");
	        displaySalary(emp1);
	        displaySalary(emp2);

	        // Show updated total
	        System.out.printf("Total yearly salary of all employees: $%.2f%n", Employee.getTotalSalary());
	    }

	    public static void displaySalary(Employee emp) {
	        System.out.printf("%s's yearly salary: $%.2f%n", emp.getName(), emp.getYearlySalary());
	    }
	}

