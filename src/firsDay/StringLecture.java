package firsDay;

public class StringLecture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Primitive data types
			//byte, short, int, long, double, char, boolean
		//non primitive data type, Object
		//String is an Object
		
		String name = "Automation class 2019";
		
		//lets get the length of the string
		int length = name.length(); //this will bring back a number
		
		System.out.println("the length of the string is: " + length);
		
		char character = name.charAt(11);
		System.out.println(character);
		
		int index = name.indexOf("c");
		System.out.println(index);
		
		String middleName = name.substring(11, 16);
		System.out.println(middleName);
		
		String myName = "Ahmed";
		String youName = "ahmed";
		
		boolean isEqual = myName.equals(youName);
		System.out.println(isEqual);
		
		Boolean isEqual2 = myName.equalsIgnoreCase(youName);
		System.out.println(isEqual2);
		
		//change to all upper case
		
		myName = myName.toUpperCase();
		System.out.println(myName);
		
		myName = myName.toLowerCase();
		System.out.println(myName);
		
		
	}

}
