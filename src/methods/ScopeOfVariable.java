package methods;

public class ScopeOfVariable {
	//this globalvar is visible in any method
	public static int globalvar = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare variable of int data type called number and assign it to 10
		//the variable number is only visible in the code block in which its declared
		int number = 10;
		//number = number + 20;
		number +=20;
		
		globalvar +=50;
		System.out.println("main method: " + number);
		System.out.println("global variable: " + globalvar);

	}
	
	public static void methodOne(){
		int number = 15;
		
		System.out.println("methodOne: " + number);
	}

}
