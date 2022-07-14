package com.javastreams.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student
{

	int sid;
	String sName;
	String grade;


	public Student(int sid, String sName,String grade) {

		this.sid=sid;
		this.sName=sName;
		this.grade=grade;
	}

}

public class StreamFlatMapObject 
{
	public static void main(String[] args)
	{
		List<Student> list1 = new ArrayList<Student>();
		list1.add(new Student(1, "prabhu", "A"));
		list1.add(new Student(2, "bala", "A"));
		list1.add(new Student(3, "raj", "A"));

		ArrayList<Student> list2 = new ArrayList<Student>();
		list1.add(new Student(1, "raja", "A"));
		list1.add(new Student(2, "ram", "A"));
		list1.add(new Student(3, "janu", "A"));

		List<List<Student>> sList  = Arrays.asList(list1,list2);

		List<String> nalmeList = sList.stream()
				.flatMap(s->s.stream()).map(n->n.sName)
				.collect(Collectors.toList());

		System.out.println(nalmeList);






	}
}
