package loops;

public class ForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for (declare and assign counter;condition; incremental)
		//shortcut (i = 1+1; same as i++)
		
		for(int i = 0; i < 3; i = i + 1) {
			System.out.println("Loop: " + i);
		}
		printNumbers();
		}
		//System.out.println("...........................");
		
		public static void printNumbers() {
			
		//write a for loop to print number from 10 to 100
		for(int i = 10; i <=100; i++) {
			System.out.println(i) ;
		}
		
	}
	

}
