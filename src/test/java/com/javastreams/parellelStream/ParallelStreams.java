package com.javastreams.parellelStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;import org.apache.poi.util.SystemOutLogger;

class Student1
{
	String name;
	int score;


	public Student1(String name, int score) {
		this.name=name;
		this.score=score;
	}

	public String getName()
	{
		return this.name; 

	}

	public int getScore()
	{
		return this.score;
	}

}

public class ParallelStreams {

	public static void main(String[] args) {


		List<Student1> studentList = Arrays.asList
				(
						new Student1("prabhu", 50),
						new Student1("vaira", 80),
						new Student1("bala", 85),
						new Student1("vankat", 75),
						new Student1("ram", 95),
						new Student1("janu", 90)

						);

		//using stream, sequential processing the data 
		studentList.stream().filter(sl->sl.getScore()>=80)
							.limit(3)
							.forEach(sl->System.out.println(sl.getName() +" "+sl.getScore()));

		//using parallel stream, processing the data using parallel streams 
		studentList.parallelStream().filter(sl->sl.getScore()>=80)
							.limit(3)
							.forEach(sl->System.out.println(sl.getName() +" "+sl.getScore()));

		
		//convert the stream to a parller stream using the parallel method 
		studentList.stream().parallel().filter(sl->sl.getScore()>=80)
									.limit(3)
									.forEach(sl->System.out.println(sl.getName() +" "+sl.getScore()));

	}

}
