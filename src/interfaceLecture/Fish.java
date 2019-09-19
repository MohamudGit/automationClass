package interfaceLecture;

import inheritanceLecture.Animals;
import inheritanceLecture.Cat;

//concrete class
public class Fish implements IAnimalsBehavior {
	
	private String name;
	
	//write constructor
	
	public Fish(String name){
		this.name = name;
		System.out.println("constructor executed!!");
	}
	


	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Fishes eat algea");
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Fishes swim");
		
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		System.out.println("Fishes breath in water");
		
	}
	
  //setters and getters

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	

}
