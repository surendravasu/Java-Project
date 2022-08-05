import java.util.ArrayList;
import java.util.HashMap;

public class Generic 
{
    public static void main(String[] args) 
    {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
	//	al.add("vasu"); //String la value kudutha error kamikum only integer value matum vangum
	//	al.add("true");
		HashMap <String,Integer> menu = new HashMap<String,Integer>();
		menu.put("idli", 10);
		menu.put("Dosai", 20);
		HashMap <String,Integer> menu1 = new HashMap<String,Integer>();
		menu1.putAll(menu);
		
		Generic gen = new Generic();
		gen.display(al);
	}

	private void display(ArrayList al) 
	{
		int total = 0;
		for(Object ob: al)
		{
			total = total+ (Integer) ob;
		}
		
		System.out.println(al.size());
		System.out.println(al.get(2));
	}
//	int total = 0;
//	for(Object ob: al)
//	{
//		System.out.println(ob);
//		
//	}
}
