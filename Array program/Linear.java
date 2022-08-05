
public class Linear 
{
	public static void main(String[] args) 
	{
		Linear lu = new Linear();
		lu.search();
	}
	public void search()
//	{
//		int[] ar = {10,5,8,20,10};
//		int no = 8;
//		if(ar[0]==no)
//		{
//			System.out.println("yes, " + no + " present at " + 0);
//		}
//		if(ar[1]==no)
//		{
//			System.out.println("yes, " + no + " present at " + 1);
//		}
//		if(ar[2]==no)
//		{
//			System.out.println("yes, " + no + " present at " + 2);
//		}
//		if(ar[3]==no)
//		{
//			System.out.println("yes, " + no + " present at " + 3);
//		}
//		if(ar[4]==no)
//		{
//			System.out.println("yes, " + no + " present at " + 4);
//		}
//	}
	
	
	//Linear search For loop program
	{
		int[] value = {10,20,30,40,50};
		int no = 40;
		for(int i=0; i<value.length; i++)
		{
			if(value[i]==no)
			{
				System.out.println("Yes, " + no + " present at " + i);
				break;
			}
		}
	}
}
				


