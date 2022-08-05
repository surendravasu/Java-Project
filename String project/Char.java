
public class Char {
	public static void main(String[] args) 
	{
		String name = "Surendravasu";
		System.out.println(name.length());
		//		System.out.println(name.charAt(0));
		//		System.out.println(name.charAt(1));
		//		System.out.println(name.charAt(2));
		//		System.out.println(name.charAt(3));
		//		System.out.println(name.charAt(4));
		char key = 'a';
		int count = 0;
		//		for(int i = 0; i<name.length();i++)
		//		{
		//			System.out.print(name.charAt(i));
		//		}
//		for(int i = 0; i<name.length();i++)
//		{
//			if(name.charAt(i) == key)
//			{
//				count++;
//			}
//		}
//		System.out.println(count);
		System.out.println(name.contains("vasu"));
		System.out.println(name.startsWith("Sur"));
		System.out.println(name.endsWith("Sur"));

	} 
}
