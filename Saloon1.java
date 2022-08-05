class Saloon1
{
public static void main(String args[])
{
	Saloon1 sal = new Saloon1();
    sal.add(5,10);
	sal.subtract(5,10,10);
}
	public void add(int no1,int no2)
	{
		System.out.println(no1+no2);
	}
	public void subtract(int no1,int no2,int no3)
	{
		System.out.println(no1+-no2-no3);
	}
}
