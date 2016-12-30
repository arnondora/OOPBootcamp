
public class ShopTester {

	public static void main(String[] args) {
		Shop shop = new Shop("7-11");
		
		System.out.println(shop);
		
		Television tele1 = new Television("Television A", 10, 20);
		tele1.buy(10);
		tele1.getName();
		
		Product pd1 = new Television ("Cup", 2, 50);
	}

}
