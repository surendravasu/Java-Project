class Customer
{
public static void main(String[] args)
{
	Supermarket emp= new Supermarket();
	emp.buy();
	emp.give_offer();
	System.out.println(Supermarket.name);
	System.out.println(Supermarket.doorno);
	System.out.println(emp.offer);
	//System.out.println(emp.profit);
	//emp.promote();


}
}