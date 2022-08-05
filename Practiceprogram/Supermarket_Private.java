
public class Supermarket_Private     //Encapsulation private method and variable
{
	static String name = "Murugan";
	int price1,discount1;
	private int profit = 20;
	public static void main(String args[])
	{
		Supermarket_Private emp = new Supermarket_Private();
		System.out.println(emp.profit); //<--private method,variable used in within class only
		emp.promote();   //<--private method,variable used in within class only
	}
	private void promote()
	{
		System.out.println("promotion");  //<--private method,variable used in within class only
	}
	public void buy()
	{
		System.out.println("buying");
	}
	public void offer()
	{
		System.out.println("offers");
	}

}
