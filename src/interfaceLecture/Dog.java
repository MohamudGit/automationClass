package interfaceLecture;

//concrete class
public class Dog implements IAnimalsBehavior{
	
private String name;
	
	//write constructor

	public Dog (String name){
		this.name = name;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Dogs eat dog food");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Dogs move using their four legs");
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		System.out.println("Dogs breath air");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
