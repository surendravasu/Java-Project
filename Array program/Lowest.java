
public class Lowest {
	public static void main(String[] args) {
		Lowest ar = new Lowest();
		ar.value();
	}

	private void value() 
	{
		int mark[] = {30,40,10,20,60};
		int low = mark[0];
		int index = 0;
		for(int i = 0; i<mark.length; i++)
		{
			if(mark[i] < low)
			{
			    low = mark[i];
				index = i;
			}
		}
		System.out.println("Lowest value is " + low + " is present at " + index);
		
		
	}

}
