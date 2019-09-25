package FactoryDesignPattern;

/**
 * ToyStore class that will create Doll, Car, or Rattle
 * @author henryvy
 *
 */
public class ToyStore{
	Toy toy;
	
	/**
	 * Passes in the type of toy to decide whether which toy to make
	 * @param type
	 * @return
	 */
	public Toy orderToy(String type)
	{		
		if(type.equals("doll"))
		{
			toy =  new Doll();
		}
		else if(type.equals("car"))
		{
			toy = new Car();
		}
		else if(type.equals("rattle"))
		{
			toy = new Rattle();
		}
		
		toy.assemble();
		toy.boxToy();
		toy.priceToy();
		
		return toy;
	}
}
