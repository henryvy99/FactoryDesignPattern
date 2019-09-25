package FactoryDesignPattern;

/**
 * Rattle class that will create the rattles
 * @author henryvy
 *
 */
public class Rattle extends Toy{
	
	/**
	 * Default Rattle name
	 */
	public Rattle()
	{
		name = "Rattle";
	}
	
	/**
	 * This method will override the assemble method in the Toy class
	 */
	public void assemble()
	{
		super.assemble();
		System.out.println("Create the frame\n"
				+ "Add the pebbles\n"
				+ "Secure the sides");
	}
}
