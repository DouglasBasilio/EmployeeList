package test;

import java.util.Locale;

import entities.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Employee douglas = new Employee(333, "Douglas", 3000.00);
		
		System.out.println("Id: " + douglas.getId());
		System.out.println("Name: " + douglas.getName());
		System.out.printf("Salary: %.2f%n", douglas.getSalary());
		
		douglas.increaseSalary(10.00);
		
		System.out.println();
		System.out.println("List of employees:");
		System.out.println(douglas);
	}

}
