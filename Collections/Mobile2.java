
public class Mobile2 
{
	int price,year;
	public Mobile2 (int price,int year)
	{
		this.price = price;
		this.year = year;
	}
	public static void main(String[] args) 
	{
		Mobile2 mobile1 = new Mobile2(10000,2019);
        Mobile2 mobile2 = new Mobile2(10000,2022);
	}
	public String toString()
	{
		return this.price + "--> " + this.year;
	}

}
