package oop;

public class OopIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instantiating calculator
		Calculator calc = new Calculator();
		
//		calc.num1 = 5;
//		calc.num2 = 10;
		
		calc.add();
		
		//create Honda car
		//instantiation
		Car honda = new Car();
		
//		honda.door = 4;
//		honda.engine = "v6 Engine";
//		honda.model = "CRV";
//		honda.tires = 4;
//		honda.headlights = 2;
		
		honda.setDoor(2);
		int doors = honda.getDoor();
		System.out.println("number of doors: " + doors);
		
		Car pilot = new Car();
//		pilot.door = 4;
//		pilot.engine = "4 cylinder";
//		pilot.model = "Pilot";
//		pilot.tires = 4;
//		pilot.headlights = 2;
		

	}

}
