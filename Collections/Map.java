
private void find_duplicates(String word) {
		// TODO Auto-generated method stub
HashMap<Character, Integer> hm = new HashMap<Character, Integer>(); 
		char[] ch = word.toCharArray(); 
		for(char letter: ch)
		{
			if(!hm.containsKey(letter))
			{
				hm.put(letter, 1);
			}
			else
			{
				int v = hm.get(letter); 
				hm.put(letter, v+1);
			}
		}
		System.out.println(hm);
			Set s = hm.entrySet(); 
			for(Object ob: s)
			{
				Map.Entry me = (Map.Entry) ob; 
				int val =	(int)me.getValue();
				if(val==1)
				{
					System.out.println(me.getKey());
					
				}
			}
	
	} 