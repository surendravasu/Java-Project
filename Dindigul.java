class Dindigul
{
int cnp, abi;
static String name;
Dindigul(int cnp, int abi,String name)
  {
  System.out.println("welcome");
	this.cnp = cnp;
	this.abi = abi;
	this.name = name;
  }
	Dindigul()
	{
		System.out.println("vasu");
	}
	Dindigul(int a,int b)
	{
		cnp = a;
		abi = b;
	}
		
public static void main(String[] args)
{
Dindigul people = new Dindigul(50,100,"madhurai");
System.out.println(people.cnp);
System.out.println(people.abi);
System.out.println(people.name);
Dindigul people1 = new Dindigul(30,40,"karur");
System.out.println(people1.cnp);
System.out.println(people1.abi);
System.out.println(people1.name);
Dindigul people4 = new Dindigul(10,20);
System.out.println(people4.cnp);
System.out.println(people4.abi);
	
Dindigul people3 = new Dindigul();

	
}
}
