
public class Fibno 
{
     public static void main(String[] args) 
     {
		Fibno fib = new Fibno();
		fib .find_fib();
	 }

	private void find_fib() 
	{
	    int a = -1;
	    int b = 1;
	    for(int i = 0; i < 10; i++)
	    {
	    	int temp = a;
	    	a  = b;
	    	b  = temp + b;
	    	System.out.println("Fibbnosics serices " + b);
	    	
//	    	int temp = a + b;
//	    	System.out.println(temp);
//	    	a = b;
//	    	b = temp;
	    }
	}
}
