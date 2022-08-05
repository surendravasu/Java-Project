public class SS_chennai
{
	int discount =2;
public SS_chennai()
{
System.out.println("cool driks");  //contructor and super keyword and super() using program
}
	public SS_chennai(int discount)
	{
		this.discount = 2;
		System.out.println(this.discount);
}
public static void main(String[] args)
{
SS_chennai ring = new SS_chennai();
}
	public void purchase()
{
System.out.println("chennai purchase" +discount);


}
}