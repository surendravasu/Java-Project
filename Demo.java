class Demo
{
    public static void main(String[] args)
    {
    Demo demo = new Demo();
    int output = demo.add(30,30);
    int multiple=demo.mul(output,2);	
	System.out.println(output);
	System.out.println(multiple);
    }
	int mul(int a,int b)
	{
		return a*b;
	}
	int add(int no1,int no2)
    {
		return no1+no2;
    }
	
}