package com.javastreams.filterMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class  TataMotors
{
	int empId;
	String empName;
	double salary;

	public TataMotors(int empId,String empName,double salary) {

		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
	}	
}

public class StreamsFilterMap {

	public static void main(String[] args) {

		ArrayList<TataMotors> tm = new ArrayList<TataMotors>();
		tm.add(new TataMotors(1, "prabhu", 20000));
		tm.add(new TataMotors(2, "sujai", 30000));
		tm.add(new TataMotors(3, "bala", 10000));
		tm.add(new TataMotors(4, "raj", 1000));
		tm.add(new TataMotors(5, "ram", 55000));

		List<Double> empSal = new ArrayList<>();

		empSal = tm.stream()
				.filter(sal->sal.salary>20000)
				.map(sal->sal.salary)
				.collect(Collectors.toList());
		
		System.out.println(empSal);

	}
}
