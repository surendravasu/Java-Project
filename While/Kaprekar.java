
public class Kaprekar
{
     public static void main(String[] args) 
     {
    	 Kaprekar fa = new Kaprekar();
		 fa.Find_Kaprekar();
	 }

	public void Find_Kaprekar() 
	{
		int a = 45;
		int b = a * a;
		int x = b;
		int c = 0;
		int d = 0;
		int digit = 0;
	    while(x > 0)
	    {
	    	c = x % 10;
			x = x / 10;
			digit++;
	    }
		while(b > 0)
		{
			c = b % 100;
			b = b / 100;
			d = d + c;
		}
		if(a==d)
		{
			System.out.println("kaprekar number " + a);
		}
		else
		{
			System.out.println("not kaprekar number " + a);
		}
		
	}
}
