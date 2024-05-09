package JAVA.Abs.Automobile;

public class design {
	 
	String colour;
	String type;//mammal,water-based,land-based...
	
	design()
	{
		colour="black";
		type="sleek";
	}
	design(String colour,String type)
	{
		this.colour=colour;
		this.type=type;
 
	}
	
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour= colour;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type= type;
	}
 
	public String toString() {
		return "Design [colour=" + colour + ", type=" + type + "]";
	}
	
	void show() {
		System.out.println("Design [colour=" + colour + ", type=" + type + "]");
	}
	
	
	
}