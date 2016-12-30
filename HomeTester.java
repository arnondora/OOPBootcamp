import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class HomeTester
{
	public static void main (String [] args) throws Exception
	{
		Scanner sc = new Scanner (System.in);
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String colours = br.readLine();
		
		StringTokenizer st = new StringTokenizer (colours, ","); 
		
		String [] color = colours.split(",");
		
		Home home1 = new Home(st.nextToken());
		Home home2 = new Home(st.nextToken());
		
		
		System.out.println("This home is " + home1.getColor());
		System.out.println("This home is " + home2.getColor());
		
		home1.setColor(new String("Green"));
		
		home1.addNewChair(new Chair("Yellow","Home1"));
		home1.addNewChair(new Chair("Blue","Home1"));		
		sc.close();
	}
}
