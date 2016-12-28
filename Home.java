import java.util.ArrayList;

public class Home
{
	//Properties
	private String name;
	private String color;
	private ArrayList things;
	
	//Constructor
	public Home (String color)
	{
		this.color = color;
		setName("Hello");
		
		things = new ArrayList();
	}
	
	//Method
	public String getColor()
	{
		return this.color;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	private void setName (String name)
	{
		this.name = name;
	}
	
	public String getName ()
	{
		return this.name;
	}
	
	public void addNewChair (Chair ch)
	{
		ch.transferOwner(getName());
		things.add(ch);
	}
}
