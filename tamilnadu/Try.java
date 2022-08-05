
public class Try {
	public static void main(String[] args) {
		Try tr = new Try();
		tr.findLCM(3,9);
		
	}
	private void findLCM(int no1, int no2) 
	{
		// TODO Auto-generated method stub
	 
		// int big = no1>no2?no1: no2; 
		int big;
		if(no1 > no2) 
		{
			big = no1;
		} 
		else 
		{
			big = no2;
		}
		if(big%no1 == 0 && big%no2==0)
		{
		System.out.println("LCM is " + big); 
		}
		
	} 

}
