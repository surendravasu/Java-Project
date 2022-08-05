import java.util.HashSet;
public class Hash1
{
	public static void main(String[] args) 
	{
		HashSet al = new HashSet(); 
		al.add(10); // Integer
		al.add(20); 
		al.add(true); 
		al.add(20); 
		al.add("Abcd");
		al.add("Abcd"); 

		//System.out.println(al.indexOf("Abcd"));

		//System.out.println(al.lastIndexOf("Abcd"));
		al.add(5.2f); 
		System.out.println(al);

		//al.add(2, "pqr");
	   //System.out.println(al);
		
		HashSet al2 = new HashSet(); 
		al2.addAll(al); 
		System.out.println(al2);
		al.clear();
		System.out.println(al);
		System.out.println(al2.contains("Abcd")); 
		//	System.out.println(al2.get(4));
		//	System.out.println(al2.subList(2, 5));
		System.out.println(al2.size()); 
		System.out.println(al2.remove("Abcd")); 
		System.out.println(al2); 
	}

}
