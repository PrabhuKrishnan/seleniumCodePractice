package com.java.lambdaEXpression.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee2
{

	String empName;
	int salary;

	public Employee2(String empName, int salary) {
		this.empName=empName;
		this.salary=salary;
	}

}

public class ConsumerInterface {

	public static void main(String[] args) {


		System.out.println("Combined function interface...");

		ArrayList<Employee2> empList = new ArrayList<>();

		empList.add(new Employee2("prabhu", 50000));
		empList.add(new Employee2("krishana",30000));
		empList.add(new Employee2("Ram",20000));


		/*
		 * use all the functional interfaces like Function, Predicate and Consumer
		 * 
		 * 
		 * Requirement 
		 * -calculate the bonus
		 * -then select the emp details based on the bouns
		 * -then print the emp details 
		 */

		//calculate the bonus
		Function<Employee2, Integer> f = e->(e.salary*10)/100;

		//condition to check the bonus 
		Predicate<Integer> p = b->b>=5000;

		//to print the emp details 
		Consumer<Employee2> c = empInfo ->{
			System.out.println("Emp Name: "+empInfo.empName);
			System.out.println("Emp Salary: "+empInfo.salary);
		};

		for (Employee2 em : empList) {

			int bonus = f.apply(em); //invoking the Functional interface

			if(p.test(bonus))	//invoking the predicate interface
			{
				c.accept(em);	//invoking the consumer interface
				System.out.println("Bonus: " +bonus);
			}
		}

	}

}
