public abstract class Product
{
	private String name;
	private double price;
	private int qty;
	
	public Product (String name, double price, int qty)
	{
		this.name = name;
		this.price = price;
		this.qty = qty;
	}
	
	public String getName () {return this.name;}
	public double getPrice() {return this.price;}
	public int getQty () {return this.qty;}
	
	public void setName (String name) {this.name = name;}
	public void price (double price) {this.price = price;}
	private void setQty (int qty) {this.qty = qty;}
	
	public void buy (int qty) {setQty(getQty() + qty);}
	public void sell (int qty) {setQty(getQty() - qty);}
}
