package inheritanceLecture;

public class Animals {
	
	//class fields
	private String name;
	private String color;
	
	//constructor = initializing class fields
	public Animals (String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	//method overload
	public Animals () {
		
	}
	
	//common behavior
	public void eat() {
	System.out.println("All Animals eat");
		
	}
	public void move() {
	System.out.println("All Animals eat");	
	}

	//getters and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
