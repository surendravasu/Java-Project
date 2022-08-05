
public class Nexted {
	public static void main(String[] args) 
	{
		
		Nexted ne = new Nexted();
		ne.next();
		
	}

	public void next() 
	{
//		int no =1;
//		for(no=1;no<=9;no+=2)
//		{
//			System.out.println(no + " ");
//		}
		
//		
//		int no = 2;
//		for(no = 2;no<=10;no+=2)
//		{
//			System.out.println(no + " ");
//		}
		
//		int no = 3;
//		for(no = 3;no<=9;no+=3)
//		{
//			System.out.println(no + " ");
//		}
//		
		int no = 1;
		for (no =1;no<=10;no+=2)
		{
			System.out.print(no + " ");
			if(no==9)
			{
				no = 0;
				System.out.println();
			}
		}
//		
	}

}
