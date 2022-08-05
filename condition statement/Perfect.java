
public class Perfect {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Perfect per = new Perfect();
		per.perfect();
		

	}

	public void perfect() {
		// TODO Auto-generated method stub
		int n = 6;
		int i = 1;
		int sum = 0;
		while(i < n)
		{
			if(n % i == 0)
			{
				sum =sum + i ;
			}
			i++;
		}
		if(n == sum) 
		{
			System.out.println("perfect number  " + n);
		}
		else
		{
			System.out.println("not perfect number  " + n);
		}
		
		
	}

}
