import java.util.ArrayList;

public class Shop
{
	private String name; 
	private ArrayList<Employee> employees;
	private ArrayList<Shelf> shelfs;
	
	public Shop (String name)
	{
		this.name = name;
		this.employees = new ArrayList<Employee>();
		this.shelfs = new ArrayList<Shelf>();
	}
	
	public int noOfEmployee () {return this.employees.size();}
	public String getName () {return this.name;}
	
	public void newEmployee (Employee emp)
	{
		this.employees.add(emp);
	}
	
	public void newShelf (Shelf shelf)
	{
		this.shelfs.add(shelf);
	}
	
	public String toString ()
	{
		return "Shop Name : " + this.getName();
	}
}
