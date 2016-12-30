import java.util.ArrayList;

public class Catagory
{
	ArrayList<Product> products;
	String name;
	
	public Catagory (String name)
	{
		products = new ArrayList<Product>();
		this.name = name;
	}
	
	public String getName () {return this.name;}
	public int noOfProducts () {return products.size();}
	
	
	public void setName() {this.name = name;}
	public void addProduct (Product product){products.add(product);}
}
