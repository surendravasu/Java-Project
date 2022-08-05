
public class Program_Object 
{
	static String name = "vasu";
	static int doorno = 1234567;
	int price,discount;
    public static void main(String args[])
    {
    	Program_Object pro = new Program_Object();
    	pro.method();
    	//System.out.println(price);
    }
    public void method()
    {
    	Program_Object pro = new Program_Object();
    	pro.price = 100;
    	pro.discount = 3;
    	Program_Object pro1 = new Program_Object();
    	pro1.price = 50;
    	pro1.discount = 5;
    	Program_Object pro2 = new Program_Object();
    	pro2.price = 80;
    	pro2.discount = 6;
    	System.out.println(pro.price);
    	System.out.println(pro1.discount);
    	System.out.println(pro2.price);
    	System.out.println(Program_Object.name);
    	System.out.println(Program_Object.doorno);
    	System.out.println(doorno);
    	System.out.println(name);
    	System.out.println(pro.name);
    	System.out.println(pro1.doorno);
    	
    	
    }
}
