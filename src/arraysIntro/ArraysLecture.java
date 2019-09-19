package arraysIntro;

public class ArraysLecture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//so far we have been declaring single variable
		
		int number = 10;
		
		//two ways we can declare an array
		//first way
		int[] numbers = new int[4]; //[4] = length
		//add value to the array 1
		numbers[3] = 1;
		numbers[2] = 2;
		numbers[1] = 3;
		numbers[0] = 4;
		
		//second way of declaring array
		int[] numbers2 = {1,2,3,4};
		
		//print the arrays - long way (no for loop)
		System.out.println(numbers2[0]);
		System.out.println(numbers2[1]);
		System.out.println(numbers2[2]);
		System.out.println(numbers2[3]);
		
		//Lets get the length of the array
		int arrayLenght = numbers2.length;
		System.out.println("The length of the array is: " + arrayLenght);
		
		//print the array using forLoop
		System.out.println("....................");	
		for (int i = 0; i < arrayLenght; i++) {
			System.out.println(numbers2[i]);	
		}
		
		 
		
		//these numbers are test results, test 1 = 80, test2 = 90, test3 = 75
		//create a method that takes an array of numbers, and print these
		//test scores to the console
		//create a method that will return the average number of array of numbers
		
		

	}
	
	public static void myarray() {
		
	}

}
