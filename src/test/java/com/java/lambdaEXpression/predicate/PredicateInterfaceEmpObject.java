package com.java.lambdaEXpression.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee
{

	String employeeName;
	int salary;
	int experience;
	
	public Employee(String emp, int sal, int exp) {
		employeeName = emp;
		salary=sal;
		experience=exp;
	}
}  

public class PredicateInterfaceEmpObject {

	public static void main(String[] args) {
	
		//Example 1
		Employee emp = new Employee("Prabhu Krishnan", 50000, 8);
		
		Predicate<Employee> pr = e->(e.salary>30000 && e.experience>3);
		System.out.println(pr.test(emp));
		
		//Example 2 
		ArrayList<Employee> e = new ArrayList<>();
		e.add(new Employee("Prabhu", 50000,8));
		e.add(new Employee("bala", 20000,9));
		e.add(new Employee("Vaira", 500000,5));
		e.add(new Employee("Ram", 30000,4));
		
		System.out.println();
		for (Employee employee : e) {
			
			if(pr.test(employee))
			{
				System.out.println(employee.salary +" "+ employee.employeeName);
			}
		}
		
	}
}
