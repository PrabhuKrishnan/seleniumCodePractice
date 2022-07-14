package com.selenium.webtable;

public class ConvertStringPriceToDouble {

	
	
	public static int convertDoubleToInt(int d){
	    //rounds off to the nearest 100
	    long l = Math.round(d);
	    int i = (int) l;
	    return i;
	}
	
}
