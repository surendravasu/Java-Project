
public class Odd {
	public static void main(String[] args) 
	{
		Odd ar = new Odd();
		ar.findOddOrEven();
		ar.findIndex();
	}

	// Odd or Even Number
	private void findOddOrEven() 
	{
		System.out.println("-------Find Odd or Even Number in Array-------");
		int val[] = {10,5,7,8,2,6};     //index=0,1,2,3,4,5
		for(int i=0; i<val.length; i++)
		{
			if(val[i] % 2 == 0)
			{
				System.out.println("Even number " + val[i]);
			}
			else
			{
				System.out.println("odd  number " + val[i]);
			}
		}	
	}


	//Odd or Even Index Number
	private void findIndex()
	{
		System.out.println("-------Find odd or Even Index Number in Array-------");
		int val[] = {10,5,7,8,2,6};      //index=0,1,2,3,4,5
		for(int i=0; i<val.length; i++)
		{
			if(i % 2 == 0)
			{
				System.out.println("Even Index Number " + val[i]);
			}
			else
			{
				System.out.println("odd  Index Number " + val[i]);
			}
		}
	}

}
