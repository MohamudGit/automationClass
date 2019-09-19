package inheritanceLecture;

public class Cat extends Animals{
	
	private String name;
	private String color;
	
	//constructor with the key word super
	public Cat (String name, String color) {
		super(name, color);
	}

	//Override is at: source then override
	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		System.out.println("Cats move using their four legs");
	}
	

}
