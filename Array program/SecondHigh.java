
public class SecondHigh {
	public static void main(String[] args) {
		SecondHigh second = new SecondHigh();
		second.value();
	}

	private void value() 
	{
		int mark[] = {60,30,40,100,80};
		int high = mark[0];
		int sec_High = mark[0];
		for(int i=0; i<mark.length; i++)
		{
			if(mark[i] > high)
			{
				sec_High = high;
				high = mark[i];
			}
			else if(mark[i] > sec_High)
			{
				sec_High = mark[i];
			}
		}
		System.out.println("Highest value is " + high);
		System.out.println("Second Highest value is " + sec_High);
		
		
	}

}
