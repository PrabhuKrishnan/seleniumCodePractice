package com.java.lambdaEXpression;

@FunctionalInterface
interface Sony
{
  
	//abstract with no parameters and no return value
	//public abstract void autoFocus();
	
	//abstract with one parameters and no return value
	//public abstract void autoFocusPoint(int numberOfAutoFocusPoints);
	
	public abstract String autoFocusMode(String mode1,String mode2);

}

public class DemoTest {
	
	public static void main(String[] args) {
		
	
		//abstract with no parameters
		/*Sony s1 = ()->System.out.println("sony eye autofocus implementation is in progress..");
		s1.autoFocus(); */
		
		//abstract with one parameter and no return value
		/*Sony s1 = (afPoints)->System.out.println("AutoFocus Points Implementation: " + afPoints);
		s1.autoFocusPoint(100); */
		
		Sony s1 = (mode1,mode2)->
		{
			System.out.println("Mode1: "+mode1+" mode2: "+mode2);
			return("autofocus mode implementation is in progress...");
		};
		
		s1.autoFocusMode("spotZone", "expandZone");
	}

}
