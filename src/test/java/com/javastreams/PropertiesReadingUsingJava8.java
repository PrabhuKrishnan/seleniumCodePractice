package com.javastreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.function.BiConsumer;

import org.testng.annotations.Test;


public class PropertiesReadingUsingJava8 {

	//using the BiConsumer Interface, we can pass two parameters with Lambda expressions
	private static BiConsumer<Object,Object> biconsumer = (k,v)->System.out.println(k+ ": " +v);

	@Test
	public void test() throws FileNotFoundException, IOException 
	{
		
		Properties prop = new Properties();
		prop.load(new FileInputStream("G:\\Profession\\Automation workspace\\seleniumCodePractice\\src\\test\\java\\com\\javastreams\\config.properties"));

		//Conventional way of reading the property file
		for(Entry<Object, Object> entry : prop.entrySet())
		{
			System.out.println(entry.getKey()+" :: "+entry.getValue());
		}


		//using Java8
		prop.forEach(biconsumer);
		//prop.entrySet().forEach(e->System.out.println(e.getKey()+" ::: " +e.getValue())); //can also write like this using lambda

	}

}
