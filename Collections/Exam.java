
import java.util.ArrayList;   // --> javala ArrayList nu oru class file iruku
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class Exam
{
	public static void main(String[] args)
	{ 
		ArrayList al = new ArrayList(); // --> ArrayList class filea al object vachu add() call panrom
		al.add(10); // Integer
		al.add(20); 
		al.add(20); // allow the duplicate al.add(20)
		al.add(true); 
		al.add("vasu"); 
		al.add(5.2f); 
		System.out.println(al);
		
		//for loop
		for(int i = 0; i < al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("");
		
//		//for each loop
//		for(Object ob: al)
//		{
//			System.out.println(ob);
//		}
		//System.out.println("");
		
		
		//for each loop //dulicate eduthu kudukra program interview program
		LinkedHashSet lhs = new LinkedHashSet(); //not allow the duplicate al.add(20)
		for(Object ob: al)
			{
				boolean result = lhs.add(ob);
				if(result == false)
				{
					System.out.println(ob);  // duplicate value print agum
				}
			}
		//System.out.println(lhs); //dulicate eduthu kudukra program interview program 
		
		HashSet hs = new HashSet(al);  //not allow the duplicate al.add(20)
		System.out.println(hs);
		
		TreeSet ts = new TreeSet();
		ts.add("Abcd");   // Treeset follow the ascending and alphaphetical order only 
		ts.add("ABCD");
		System.out.println(ts);
		
	}	
	
}