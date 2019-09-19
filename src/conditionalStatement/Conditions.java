package conditionalStatement;

public class Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		//relational operators
		//< less than
		//> greater than
		//<= less than or equal
		//>= greater or equal
		//== equals
		//!= not equals
		
		int num1 = 2;
		int num2 = 3;
		
		boolean result = num1 < num2;
		System.out.println(result);
		
		num1 = 2;
		num2 = 3;
		
		result = num1 > num2;
		System.out.println(result);
		
		num1 = 2;
		num2 = 3;
		
		result = num1 <= num2;
		System.out.println(result);
		
		num1 = 2;
		num2 = 3;
		
		result = num1 >= num2;
		System.out.println(result);
		
		num1 = 2;
		num2 = 3;
		
		result = num1 == num2;
		System.out.println(result);
		
		num1 = 2;
		num2 = 3;
		
		result = num1 != num2;
		System.out.println(result);
		
		if(num1 == num2){
			System.out.println("They are equal");
		} else if (num1 < num2) {
			System.out.println("num1 is less than num2");
		} else if (num1 > num2) {
			System.out.println("num1 is greater than num2");
		} else {
			System.out.println("unknown");
		}
		
		//logical operators
		//and &&
		//or ||(pipe)
		//not !
		
		int grade = -20;
		char gradeLetter = 'Z';
		
		if ((grade <= 100) && (grade >=90)) {
			gradeLetter = 'A';
			System.out.println("your grade letter is: " + gradeLetter);
		} else if ((grade <= 89)&& (grade >= 80)) {
			gradeLetter = 'B';
			System.out.println("your grade letter is: " + gradeLetter);
		} else if ((grade <= 70)&& (grade >= 79)) {
			gradeLetter = 'C';
			System.out.println("your grade letter is: " + gradeLetter);
		} else if ((grade <= 60)&& (grade >= 69)) {
			gradeLetter = 'D';
			System.out.println("your grade letter is: " + gradeLetter);
		} else if ((grade <= 39)&& (grade >= 0)) {
			gradeLetter = 'E';
			System.out.println("your grade letter is: " + gradeLetter);
		} else 
			System.out.println("undifined grade");
		{
			
		}
		
		//If the student receives letter grade A, i want to print, you are excellent student
		//if the student receives letter grade B, print you are above average student
		//if the student receives letter grade C, print you are average student
		//if the student receives letter grade D, print you are below average student
		//if the student receives letter grade E, print you have failed
		//for all other letter grades print undefined letter grade
		
		
		System.out.println("++++++++++ today stuff++++++++++");
		char letter = 'W';
		
		switch(letter) { 
		//all my switch cases
		case 'A':
		System.out.println("you are an excellent student");
		break;
		case 'B':
		System.out.println("you are above average student");
		break;
		case 'C': 
		System.out.println("you are an average student");
		break;
		case 'D':
		System.out.println("you are below average student");
		break;
		case 'E':
		System.out.println("you failed");
		break;
		default:
		System.out.println("Unknown letter");
		break;
		
			
		}
			
	}

}
