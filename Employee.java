package lab07;

public class Employee {
	    private String name;
	    private double monthlySalary;
	    private static double total_salary = 0;

	    public Employee(String name, double monthlySalary) {
	        this.name = name;
	        if (monthlySalary > 0) {
	            this.monthlySalary = monthlySalary;
	            total_salary += getYearlySalary();
	        } else {
	            this.monthlySalary = 0.0;
	        }
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setMonthlySalary(double salary) {
	        if (salary > 0) {
	            total_salary -= this.getYearlySalary(); // subtract old
	            this.monthlySalary = salary;
	            total_salary += this.getYearlySalary(); // add new
	        }
	    }

	    public double getMonthlySalary() {
	        return monthlySalary;
	    }

	    public double getYearlySalary() {
	        return monthlySalary * 12;
	    }

	    public void increaseSalary(double percent) {
	        if (percent > 0) {
	            total_salary -= getYearlySalary(); // remove current salary
	            monthlySalary *= (1 + percent / 100.0); // increase
	            total_salary += getYearlySalary(); // add new
	        }
	    }

	    public static double getTotalSalary() {
	        return total_salary;
	    }
	}

