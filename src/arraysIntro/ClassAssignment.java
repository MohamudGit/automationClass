package arraysIntro;

public class ClassAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//these numbers are test results, test 1 = 80, test2 = 90, test3 = 75
		//create a method that takes an array of numbers, and print these
		//test scores to the console
		//create a method that will return the average score
		//create another that will take the average test score, and assign a grade letter
		
		//first create the array
		
		double[] testScores = {80, 90, 75};
		//call the printScores method, and pass the testScores array to it
		printScores(testScores);
		
		//double[] averageTestScores = {81.7};
		//printScores(averageTestScores);
		
		//when we call this method, it should bring back the average test score
		double averageScore = TestScoreAverage(testScores);
		System.out.println("Your average score is: " + averageScore);
		

	}//end main method
	
	public static void printScores(double[] scores){
		for(int i = 0; i < scores.length; i++) {
		System.out.println(scores[i]);
		
		//
		//gradeLetter(averageScore);
		}
			
		}
		
		//this method is suppose to colculate the average
	public static double TestScoreAverage(double[] scores) {
		//logic will go here. will use a for loop
		double totalScore = 0;
		for(int i = 0; i < scores.length; i++) {
			
			totalScore += scores[i];
		}
		
		System.out.println(totalScore);
	
	
	//calculate the average
	return totalScore/scores.length;
	}
	
	//create another that will take the average test score, and assign a grade letter
	static public void gradeLetter(double grade) {
		if((grade >= 90) && (grade <=100)) {
			System.out.println("your grade letter is A");
		if((grade >= 80) && (grade <=89)) {
			System.out.println("your grade letter is B");
		if((grade >= 70) && (grade <=79)) {
			System.out.println("your grade letter is C");
		if((grade >= 60) && (grade <=69)) {
			System.out.println("your grade letter is D");
		}
		}
		}
		}
	}

}
