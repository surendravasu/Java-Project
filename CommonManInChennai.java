package Tamilnadu.chennai;
class CommonManInChennai implements Trafficrules
{
	public static void main(String args[])
	{
		CommonManInChennai rule = new CommonManInChennai();
		rule.goByDieselVehicle();
		rule.goByBicycle();
	}
	
	public void goByDieselVehicle()
	{
		System.out.println("goByDieselVehicle");
	}
	
	public void goByBicycle() 
	{
		System.out.println("goByBicycle");
	}
}