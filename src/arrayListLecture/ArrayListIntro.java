package arrayListLecture;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<>();
		
		System.out.println("The size of the arrayList is: " + names.size());
		
		//add an element in the arrayList
		names.add("Ahmed");
		System.out.println("The size of the arrayList is: " + names.size());
		names.add("Zakariye");
		names.add("Ali");
		names.add("Kamal");
		names.add("Andrew");
		names.add("Mohamud");
		
		//use for loop to print all the names on the arrayList
		for(int i = 0; i > names.size(); i++){
			System.out.println(names.get(i));
		}
		System.out.println("The size of the arrayList is: " + names.size());
		
		//replace kamal with abdul
		names.set(3, "Ahmed");
		
		
		//foreach loop, to print all the names
		
		for(String name : names) {
			System.out.println(name);
		}
		
		//lets check if the name "Ahmed is in the list
		if(names.contains("Ahmed")) {
			System.out.println("Ahmed is in the arrayList");
		}
		
		//remove Ahmed from arrays
		names.remove("Ahmed");
		System.out.println("The size of the arrayList is: " + names.size());
	}

}
