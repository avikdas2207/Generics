package Generics;

public class PrintMax {

	//To get the max value of the passed T type array
	public static <T extends Comparable<T>> T getMax( T [] array) 
	{
		T max = array[0];
		
		for (T element : array)
		{
			if (element.compareTo(max) > 0)
				max = element;
		}
		return max;
	}
	
	public static void main(String[] args) 
	{
		Integer [] intArray = {11, 23, 33};
		Float [] floatArray = {1.1f, 2.3f, 3.3f};
		String [] stringArray = {"Apple", "Pineapple", "Banana"};
		Double [] doubleArray = {1d, 2d, 4d};
		
		System.out.println(getMax(intArray));
		System.out.println(getMax(floatArray));
		System.out.println(getMax(stringArray));
		System.out.println(getMax(doubleArray));

	}

}