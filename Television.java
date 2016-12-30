public class Television extends Product implements Switch
{
	boolean status;
	
	public Television (String name, double price, int qty)
	{
		super(name,price,qty);
		
		turnOff();
	}
	
	//setter
	public void turnOn () {status = true;}
	public void turnOff() {status = false;}

}
