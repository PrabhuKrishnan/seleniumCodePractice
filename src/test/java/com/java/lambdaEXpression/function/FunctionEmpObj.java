package com.java.lambdaEXpression.function;

import java.util.ArrayList;
import java.util.function.Function;

import com.google.common.base.Predicate;

class Employee1
{

	String empName;
	int salary;

	public Employee1(String empName, int salary) 
	{
		this.empName=empName;
		this.salary=salary;
	}
}

public class FunctionEmpObj {

	public static void main(String[] args) {

		ArrayList<Employee1> empList = new ArrayList<>();
		empList.add(new Employee1("prabhu", 50000));
		empList.add(new Employee1("krishana",30000));
		empList.add(new Employee1("Ram",20000));
		 
		Function<Employee1, Integer> fn = e-> //function
		{
			int sal = e.salary;
			
			if(sal>=10000 && sal<=20000)
				return(sal*10/100);
			else if (sal>20000 && sal<=30000)  
				return(sal*20/100);
			else if (sal>40000 && sal<=50000)  
				return(sal*30/100);
			else
				return(sal*40/100);
		};
		
		Predicate<Integer> p = b->b>5000; //predicate
		
		for (Employee1 emp : empList) {
			
			 int bouns = fn.apply(emp); //apply method from function interface
			 
			 if(p.test(bouns)) //result from function method and then use the test method from predicate 
			 {
			 System.out.println("Employee Name: "+emp.empName+" Salary: " + emp.salary+" Bouns: "+ bouns);
			 }
		}
		
	}

}
