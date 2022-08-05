
public class Array 
{
	public static void main(String[] args) 
	{
		Array ar = new Array();
		ar.temp();

	}
	public void temp() 
	//	{
	//		int[] ar = {5,10,15,20,25,8}; //{5,10,15,20,25,8}-{0,1,2,3,4,5}-index
	//		int temp = ar[5];
	//		ar[5] = ar[4];                               //25-->8
	//		ar[4] = ar[3];
	//		ar[3] = ar[2];
	//		ar[2] = ar[1];
	//		ar[1] = ar[0];
	//		ar[0] = temp;
	//		for(int i = 0; i < ar.length; i++) 
	//		{
	//			System.out.println(ar[i]);
	//		}
	//	}


		{
				int[] ar = {5,10,15,20,25,8};
				int temp = ar[5];
				for(int i = 5; i>=1; i--)
				{
					ar[i] = ar[i-1];
				}
				ar[0] = temp;
				for(int i=0; i<ar.length; i++)
				{
					System.out.println(ar[i]);
				}				
		}
	
	
	
	
//     //linear search program
//	{
//		int[] ar = {10,5,7,8,2,6};
//		int no = 8;
//		for(int i=0; i<ar.length; i++)
//		{
//			if(ar[i]==no)
//			{
//				System.out.println("yes,Present " + i);
//				break; 
//			}
//		}
//	}
}



