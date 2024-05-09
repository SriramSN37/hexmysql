package JAVA.Abs.Automobile;

public class cars extends design{
	 
	int year;
	String model_name;
	String type;
	
	cars()
	{
		year=7;
		model_name="swift";
		type="hatchback";
	}
	
	cars(int age,String name,String breed,String colour,String type)// parametes of the parent class included as well for creating a parameterized constructor for child class!!
	{
        super(colour,type);
		this.year=age;
		this.model_name=name;
		this.type=breed;
	}
	
	
	public int getAge() {
		return year;
	}
	public void setAge(int age) {
		this.year = age;
	}
	public String getName() {
		return model_name;
	}
	public void setName(String name) {
		this.model_name = name;
	}
	public String getBreed() {
		return type;
	}
	public void setBreed(String breed) {
		this.type = breed;
	}
	@Override
	public String toString() {
		return  super.toString()+ "Design [colour=" + colour + ", type=" + type + "]";
	}
	void show() {
		super.show();
		{
			System.out.println("Cars [year=" + year + ", name=" + model_name + ", type=" + type + "]");
		}

}}
    

