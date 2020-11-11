package Generics;

public class PrintMax<T extends Comparable<T>> {

	T [] inputArr;
	
	//Constructor
	public PrintMax(T ... inputArr)
	{
		this.inputArr = inputArr;
	}
	
	//To get the max value of the passed T type array
	public static <T extends Comparable<T>> T getMax(T [] inputArr) 
	{
		T max = inputArr[0];
		
		for (T element : inputArr)
		{
			if(element.compareTo(max) > 0)
				max = element;
		}
		return max;
	}

	//To call this method on objects of class PrintMax
	public T getMax()
	{
		printMax(PrintMax.getMax(this.inputArr));
		return PrintMax.getMax(this.inputArr);
	}
	
	private void printMax(T max) 
	{
		System.out.println(max);
	}

	public static void main(String[] args) 
	{
		new PrintMax<Integer>(3, 4, 5, 9, 238).getMax();
		new PrintMax<Float>(3.5f,4.5f,5.5f, 2000.0f).getMax();
		new PrintMax<String>("Apple","Pineapple","Hyena","Zebra").getMax();

	}

}