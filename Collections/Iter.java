import java.util.ArrayList;   // --> javala ArrayList nu oru class file iruku
import java.util.Iterator;
import java.util.List;

public class Iter 
{
    public static void main(String[] args) 
    {
    	ArrayList al = new ArrayList(); // --> ArrayList class filea al object vachu add() call panrom
		al.add('a'); // Integer
		al.add('z'); 
		al.add('c'); 
		al.add('d'); 
		
//		Iterator it = al.iterator();
//		boolean result = it.hasNext();
//		while(result)
//		{
//			System.out.println(it.next());
//			result = it.hasNext();
//		}
//		
		
		Iterator it = al.iterator();
		boolean result = it.hasNext();
		while(result)
		{
			Object ob = it.next();
			Character s = (Character)ob;
			if(s.equals('z'))
			{
				it.remove();
			}
			result = it.hasNext();
		}
		System.out.println(al);
		

	}
}
