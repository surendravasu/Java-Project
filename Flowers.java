class Flowers
{
	public static void main(String args[])
	{
		int flowers = 128;
		while(flowers > 1) 
		{
			flowers = flowers / 2;
			System.out.println("Flowers ****  "+flowers);
		}
		int lotus = 1;
		while(lotus <= 128)
		{
			System.out.println("lotus ******  " + lotus);
			lotus = lotus * 2;
		}
	}
}