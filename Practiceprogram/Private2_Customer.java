public class Private2_Customer 
{
	public static void main(String args[])
	{
		Supermarket_Private emp = new Supermarket_Private();
		emp.price1 = 50;
		emp.discount1 = 5;
		//emp.promote();     <--private variable,method another class not used
		//emp.profit = 20;  <--private variable,method another class not used
		//System.out.println(emp.profit);  <--private variable,method another class not used
		System.out.println(emp.price1);
		System.out.println(emp.discount1);
		System.out.println(Supermarket_Private.name);  //<--static variable access in class name only
		emp.buy();
		emp.offer();
	}

}
