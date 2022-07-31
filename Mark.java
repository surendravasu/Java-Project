class Mark
{
public static void main(String[] args)
{
int tam = 50;
int eng = 60;
float mat = 70.5f;
Mark mark = new Mark();
int res = mark.calc(tam);
System.out.println( "Tamil Mark " +res);
int res1 = mark.calc(eng);
System.out.println("English Mark " +res1);
float res2 = mark.calc(mat);
System.out.println("Maths Mark " +res2);
}
int calc(int tam)
{
	int add = 25;
	int tot = add + tam;
	return tot;
}
	float calc(float mat)
	{
		float sub = 25;
		float tot = mat + sub;
		return tot;
		
	}
}
