package com.bridgelabz.generics_main;

public class PrintMax {

	//To get the max value of the passed int array
	public static Integer getMax( Integer [] array) 
	{
		Integer max = array[0];
		
		for (Integer num : array)
		{
			if (num.compareTo(max) > 0)
				max = num;
		}
		return max;
	}
	
	//To get the max value of the passed float array
	public static Float getMax( Float [] array) 
	{
		Float max = array[0];
		
		for (Float num : array)
		{
			if (num.compareTo(max) > 0)
				max = num;
		}
		return max;
	}
	
	public static void main(String[] args) 
	{
		Integer [] intArray = {11, 23, 33};
		Float [] floatArray = {1.1f, 2.3f, 3.3f};
		
		System.out.println(PrintMax.getMax(intArray));
		System.out.println(PrintMax.getMax(floatArray));

	}

}