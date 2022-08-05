package tamilnadu.chennai;

public class lcm {
	public static void main(String[] args) {
		lcm lc = new lcm();
		lc.findLCM(3,9);
	}
	public void findLCM(int no1, int no2) 
	{
		// TODO Auto-generated method stub
	 
		int big = no1>no2?no1: no2; 
		while(true)
		{
		if(big%no1 ==0 && big%no2==0)
		{
		System.out.println("LCM is " + big); 
		break; 
		}
		big++; 
		}
		
	} 
}

