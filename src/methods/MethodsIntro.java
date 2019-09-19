package methods;

public class MethodsIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method call
		System.out.println("line 8: before myFirstMethod call");
		myFirstMethod("Ahmed");
		double dividedValue = divideTwoNumbers(12,5);
		System.out.println("Result value is: " + dividedValue);
		//addTwoNumbers(2,10);
		//addTwoNumbers(10,5);
		System.out.println("line 13: after myFirstMethod call");
		
		if(isEvenOrOdd(10)) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
	}
	
	//write a method that will test a number if it is even or odd
	//if it is even return true
	//if it is odd, return false
	
	public static boolean isEvenOrOdd(int number) {
		//any number that is divisible by 2 is even number
		//divide number by 2, if reminder is zero, its even
		//if its the reminder is otherthan zero, its odd
		
	
		if((number % 2) ==0) {
			return true;
		} else {
			return false;
		}
	}
	
	//write a method and will divide two numbers
	//this method should return the result
	//print the result in main method 
	
	//two types of method
	//no-data returning method: void
	//will return a data: what kind of data is coming back
	//int, boolean, double, string ... etc
	
	//write a method that adds two whole numbers
	//passing parameters/arguments to the method
	
	//passing parameters/arguments to the method
	public static int addTwoNumbers(int num1, int num2) {
		//int num1 = 5;
		//int num2 = 10;
		int result = num1 + num2;
		System.out.println(result);
		return result; 
	}
	
	public static double divideTwoNumbers(double num1, double num2) {
		double result = num1 / num2;
		//System.out.println(result);
		return result;
	}
	
	//Print: hello Ahmed from myFirstMethod
	
	public static void myFirstMethod(String name){
		System.out.println("Hello " + name +  " from myfirstMethod");
	}
	
	

}
