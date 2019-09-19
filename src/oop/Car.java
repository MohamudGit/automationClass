package oop;

public class Car {
	
	//encapsulation
	private int door;
	private String engine;
	private String model;
	private int tires;
	private int headlights;
	
	//constructor
	public Car(int door, String engine, String model, int tires,
			int headlights) {
		System.out.println("constructor executed!!");
		this.door = door;
		this.engine = engine;
		this.model = model;
		this.tires = tires;
		this.headlights = headlights;
	}
	
	//setters and getters, they are all motheds. you can auto generate it (click Source, generate getters and setters
	//READ ahead: inheritance and interface
	//set door class variable
	public void setDoor(int numOfDoors){
		this.door = door;
		//door = numOfDoors;
	}
	
	//getter for the variable door
	public int getDoor() {
		return this.door;
	}
	
	public void setEngine(String numOfengine){
		this.engine = engine;
	
	}
	
	public String getEngine(){
		return this.engine;
	}
	
	public void setModel(String numOfModel){
		this.model = model;
	}
	
	public String getModel(){
		return this.model;
	}
	
	public void setTires(int numOfTires){
		this.tires = tires;
	}
	public int getTires(){
		return this.tires;
	}
	public void setHeadLights(){
		this.headlights = headlights;
	}
	public int getHeadLights(){
		return this.headlights;
	}
}
