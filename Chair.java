public class Chair
{
	String color;
	String owner;
	
	public Chair (String color, String owner)
	{
		this.color = color;
		this.owner = owner;
	}
	
	public String getColor () {return this.color;}
	public String getOwner () {return this.owner;}
	
	public void setColor (String color) {this.color = color;}
	public void transferOwner (String newOwner) {this.owner = newOwner;}
}
