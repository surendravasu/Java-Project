
public class Add {
	
	public static void main (String args[])
	{
		Add ad = new Add();
		ad.add();
	}
	public void add()
	{
	int no = 5;
//    int add = 1;
	int var = 1;
//	while(no>=add)
//	{
//		var = var * add; 
//		add++;
//	}
	for (int add = 1;no>=add;add++)
	{
		var = var * add;
	}
	System.out.println("Enter the add number is "  + var);

}
}
