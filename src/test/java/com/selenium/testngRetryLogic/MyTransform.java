package com.selenium.testngRetryLogic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class MyTransform implements IAnnotationTransformer {

	
	 //overridden method from IAnnotationTransformer interface
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod)
	{
		annotation.setRetryAnalyzer(RetryAnalyzerCondition.class);
	}
	
}
