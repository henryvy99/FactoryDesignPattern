package FactoryDesignPattern;

/**
 * Toy class that will keep track of the toys name
 * with 3 additional methods.
 * @author henryvy
 *
 */
public abstract class Toy {
	protected String name;
	
	/**
	 * Assembles the toys
	 */
	public void assemble()
	{
		System.out.println("Putting together a " + name);
	}
	
	/**
	 * Boxes up the toys
	 */
	public void boxToy()
	{
		System.out.println("Putting the " + name + " in a box");
	}
	
	/**
	 * Prices the toys
	 */
	public void priceToy()
	{
		System.out.println("Adding price on " + name);
	}

}
