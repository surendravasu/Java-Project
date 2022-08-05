import java.util.ArrayList;
import java.util.Collections;

public class Program 
{
	public static void main(String[] args) 
	{
        Mobile2 mobile1 = new Mobile2(10000,2019);
        Mobile2 mobile2 = new Mobile2(10000,2022);
        ArrayList al = new ArrayList();
       // al.add(mobile1);
       // al.add(mobile2);
        al.add(10);
        al.add(20);
        al.add(5);
        Collections.sort(al);
       
        System.out.println(al);
        
        
	}
	public String toString()
	{
		return this.price + "--> " + this.year();
	}
}
