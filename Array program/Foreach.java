
public class Foreach 
{
	public static void main(String[] args) 
	{
		Foreach ea = new Foreach();
		ea.find_foreach();
	}

	private void find_foreach() 
	{
	    //for each loop
		int[] ar = {10,20,30};
		for(int no: ar)
		{
			System.out.println(no);
		}
		
	}

}
