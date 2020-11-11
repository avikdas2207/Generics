package Generics;

public class PrintMax<T extends Comparable<T>> {

	T input1, input2, input3;
	
	//Constructor
	public PrintMax(T input1, T input2, T input3)
	{
		this.input1 = input1;
		this.input2 = input2;
		this.input3 = input3;
	}
	
	//To get the max value of the passed T type array
	public static <T extends Comparable<T>> T getMax(T input1, T input2, T input3) 
	{
		T max = input1;
		if(input2.compareTo(max) > 0)
			max = input2;
		if(input3.compareTo(max) > 0)
			max = input3;
		return max;
	}
	
	//To call this method on objects of class PrintMax
	public T getMax()
	{
		return PrintMax.getMax(this.input1, this.input2, this.input3);
	}
	
	public static void main(String[] args) 
	{
		System.out.println(new PrintMax(3,4,5).getMax());
		System.out.println(new PrintMax(3.5f,4.5f,5.5f).getMax());
		System.out.println(new PrintMax("Apple","Pineapple","Zebra").getMax());

	}

}