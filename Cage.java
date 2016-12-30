import java.util.ArrayList;

public class Cage <E> {
	private ArrayList<E> pets;
	
	public Cage ()
	{
		pets = new ArrayList<E>();
	}
	
	public void addPet (E newPet)
	{
		pets.add(newPet);
	}
}
