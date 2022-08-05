class Bus1
{
int amount;
public static void main(String args[])
{
Bus1 bus = new Bus1();
int bu = bus.add();
System.out.println(bu);
	int sub = bus.subtract(bu,10);
	System.out.println(sub);
	char ch = bus.check();
	//System.out.println(ch);
System.out.println(bus.check());
	
}
	int subtract (int no1,int no2)
	{
		return no1-no2;
	}
	char check()
	{
		return 's';
	}
	int add()
	{
		
		return 5+10;
	}
	
}