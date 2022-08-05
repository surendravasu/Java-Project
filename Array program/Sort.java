
public class Sort 
{
	public static void main(String[] args) 
	{
		Sort ar = new Sort();
		ar.Find_Sort();
	}

	private void Find_Sort() 

	{
		int ar[] ={4,6,10,8,2};
		int temp = 0;
		for (int j=1; j<ar.length; j++)
		{
			for(int i=0; i<ar.length - j; i++)
			{
				if(ar[i] > ar[i+1])
				{
					temp = ar[i];
					ar[i] = ar[i+1];
					ar[i+1] = temp;
				}
			}
		}
		for(int k=0; k < ar.length; k++)
		{
			System.out.println("Sorting number " + ar[k]);
		}

	}

}


























