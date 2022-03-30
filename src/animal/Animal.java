package animal;

public class Animal {
	
	// if we do protected, we can access the name and add it to the constructor of the object
	protected String name;
	private String color;
	
	
	public void eat() {
		System.out.println("munch munch");
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

}
