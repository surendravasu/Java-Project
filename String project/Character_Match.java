
public class Character_Match 
{
	public static void main(String[] args)
	{
		Character_Match match = new Character_Match();
		match.letter();
	}

	public void letter() 
	{
		String name = "Surender";
		System.out.println(name + "vasu");
		System.out.println(name.concat("vasu"));
		System.out.println(name.indexOf("e"));
		System.out.println(name.lastIndexOf("e"));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
		
		// compare to charcter program....
		String one = "surendravasu";
		String two = "surend";
		boolean stars = true;
		for(int i = 0; i < two.length(); i++)
		{
			if(one.charAt(i) == two.charAt(i))
			{
				continue;
			}
			else
			{
				stars = false;
				break;
			}
		}
		if(stars == true)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}


	}

}
