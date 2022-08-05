
public class High 
{
    public static void main(String[] args) 
    {
		High ar = new High();
		ar.value();
	}

	public void value() 
//	{
//		int marks[] = {90,76,58,98,100};
//		int high = 0;
//		if(marks[0]>high)
//		high = marks[0]; // high 90
//		if(marks[1]>high)
//		high = marks[1];
//		if(marks[2] > high)
//        high = marks[2];
//		if(marks[3] > high)
//		high = marks[3];
//		if(marks[4] > high)
//		high = marks[4];	
//	}
//	For loop highest number
	{
		int mark[] = {90,76,106,98,100};  
		int high = mark[0];
		int index = 0;
		for(int i=1; i<mark.length; i++)
		{
			if(mark[i] > high)
			{
				high = mark[i];
				index = i;
			}
		}
		System.out.println(" higest value  " + high + " is present at " + index);
	}
	
	
}
		
