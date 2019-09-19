package loops;

public class WhileAndDoWhileLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		while(counter < 10) {
			//body
			System.out.println(counter);
			counter++;
		}
		
		System.out.println(".............do while loop");
		
		int cnt = 11;
		do {
			System.out.println(cnt);
			cnt++;
		}while (cnt < 10);
	}

}
