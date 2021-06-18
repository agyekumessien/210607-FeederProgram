package fixtures;

public abstract class fixture {
	private String name;
	private String description;

	
	public fixture(String name, String description) {
		this .name = name;
		this.description = description;
	}
	
	
	
	
	public String getDescription() {
		return this.description;
	}
	
	public String getName() {
		return name;
	}
}