class Sweet
{
	public static void main(String[] args)
	{
		Sweet swt=new Sweet();
		int result = swt.add();
		swt.subtract(result,30);
		System.out.println(result);
		char result1 = swt.oil();
		System.out.println(result1);
		byte result2=swt.laaddu();
	}
	void subtract(int no1,int no2)
	{
		System.out.println(no1-no2);
	}
	byte laaddu()
	{
		return 127;
	}
	char oil()
	{
		return 'a';
	}
	int add()
	{
	return 20+30;

	}
}


