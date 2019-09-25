package FactoryDesignPattern;

/**
 * Doll Class that will create the dolls
 * @author henryvy
 *
 */
public class Doll extends Toy{

	/**
	 * Default Doll name
	 */
	public Doll()
	{
		name = "Doll";
	}
	
	/**
	 * This method will override the assemble method in the Toy class
	 */
	public void assemble()
	{
		super.assemble();
		System.out.println("Connect all pieces\n"
				+ "Paint the face\n"
				+ "Add the dress\n"
				+ "Add the shoes");
	}
}
