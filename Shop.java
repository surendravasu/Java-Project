class Shop
{
	static int doorno=123;
	static String name="ABCD";
	int price,discount;
public static void main(String[] args)
{
	System.out.println(Shop.doorno);
	System.out.println(Shop.name);
	Shop product1=new Shop();
	product1.price=100;
	product1.discount=10;
	Shop product2=new Shop();
	System.out.println(Shop.doorno);
	System.out.println(Shop.name);
	product2.price=90;
	product2.discount=9;
	Shop product3=new Shop();
	System.out.println(Shop.doorno);
	System.out.println(Shop.name);
	product3.price=150;
	product3.discount=15;
	System.out.println(product1.price);
	System.out.println(product3.discount);

}
	
}
