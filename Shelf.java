import java.util.ArrayList;

public class Shelf
{
	ArrayList<Catagory> catagories;
	
	public Shelf ()
	{
		catagories = new ArrayList<Catagory>();
	}
	
	public void addCatagory (Catagory cat)
	{
		catagories.add(cat);
	}
}
