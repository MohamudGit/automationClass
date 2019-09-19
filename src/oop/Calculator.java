package oop;

public class Calculator {
	
	//two parts to a class
	//calculator can add, substract, and multiply two numbers
	
	//class fields: physical description
	
	int num1;
	int num2;
	
	//class behavior: behavior description
	public void add() {
		int result = num1 + num2;
		System.out.println(num1 + " added to" + num2 +" equals: " + result);
		
	}
	
	

}
