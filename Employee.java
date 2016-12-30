public class Employee
{
	private String name;
	private int age;
	private String address;
	private String position;
	
	public Employee (String name, int age, String address, String position)
	{
		this.name = name;
		this.age = age;
		this.address = address;
		this.position = position;
	}
	
	//getter method
	public String getName () {return this.name;}
	public int getAge() {return this.age;}
	public String getAddress() {return this.address;}
	public String getPosition() {return this.position;}
	
	//setter method
	public void setName (String name) {this.name = name;}
	public void setAge (int age) {this.age = age;}
	public void setAddress (String address) {this.address = address;}
	public void setPosition (String position) {this.position = position;}
}
