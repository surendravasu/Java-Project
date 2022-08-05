
public class Projector {
	
	public static void main(String[] args) {
		Projector pro = new Projector();
		pro.display1(1);
	}

	 int display1(int i) 
	{
		System.out.println("display 1 "  + i);
		if (i <= 3)
		{
			i = i + 1;  //no = 2
			//System.out.println("display 2 " + i);
			int result = display2(i);
			return result;
			
		}
			return i;
		
	}

	int display2(int i) 
	{
		System.out.println("display 2 "  + i);
		if(i <= 3)
		{
			i = i + 1; //no = 3
			//System.out.println("display 3 " + i);
			int result = display3(i);
			return result;
			
		}
			return i;
		
		
	}

	int display3(int i) 
	{
		System.out.println("display 3 "  +  i);
		if(i <=3)
		{
			i = i + 1; // no = 4
			//System.out.println("display 4 " + i);
			int result = display4(i);
			return result;
		}
			return i;
		
		
	}
	int display4(int i)
	{
		System.out.println("diaplay 4 "  +  i);   //no 4
		if(i <= 3)
		{
			i = i + 1;
			display4(i);
		}
			return i;
	}

}
