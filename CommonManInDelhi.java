package india.newdelhi;
import Tamilnadu.chennai.Trafficrules;
class CommonManInDelhi implements Trafficrulesdelhi,Trafficrules
{
	public static void main(String args[])
	{
	CommonManInDelhi rules1 = new CommonManInDelhi();
	rules1.goByDieselVehicle();
	rules1.goByBicycle();
	rules1.dontgoByDieselVehicle();
	rules1.dontgoByBicycle();
	}
	public void goByDieselVehicle() 
	{
		System.out.println("goByDieselVehicle");
	}
	public void goByBicycle() 
	{
		System.out.println("goByBicycle");
	}
	public void dontgoByDieselVehicle()
	{
	System.out.println("dont goByDieselVehicle");
	}
    public void dontgoByBicycle()
	{
	System.out.println("dont goByBicycle");
    }
}