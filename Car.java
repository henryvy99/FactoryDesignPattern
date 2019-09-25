package FactoryDesignPattern;

/**
 * Car class that will create the cars
 * @author henryvy
 *
 */
public class Car extends Toy{
	
	/**
	 * Default Car name
	 */
	public Car()
	{
		name = "Car";
	}
	
	/**
	 * This method will override the assemble method in the Toy class
	 */
	public void assemble()
	{
		super.assemble();
		System.out.println("Make the body\n"
				+ "Add the wheels\n"
				+ "Paint the car");
	}
}
