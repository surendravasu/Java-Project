class Pandian_Stores
{
int price, discount;//Global non static variables
String brand;// Object specific variables
	Pandian_Stores(int price ,int discount,String brand)//local variables
	{// constructor overloading
		this.price = price;//current object of same class
		this.discount = discount;
		this.brand = brand;
		System.out.println("Constructor");
	}
	Pandian_Stores()
	{
		System.out.println("welcome to Pandian_Stores");   //constructor program
	}
	Pandian_Stores(int price, String brand)
	{
		this();//explisit call of construtor
		this.price = price;
		this.brand = brand;
		System.out.println(this.price);
		System.out.println(this.brand);
		
	}
public static void main(String[] args)
{//instance - object
Pandian_Stores prod1 = new Pandian_Stores(100,5,"onion");
	System.out.println(prod1.price);
	System.out.println(prod1.discount);
	System.out.println(prod1.brand);
//prod1.price = 100;
//prod1.discount = 5;
//prod1.brand = "onion";
Pandian_Stores prod2 = new Pandian_Stores(50,3,"Hamam soap");
	System.out.println(prod2.price);
	System.out.println(prod2.discount);
	System.out.println(prod2.brand);
//prod2.price = 50;
//prod2.discount = 3;
//prod2. brand = "Hamam soap";
	Pandian_Stores prod3 = new Pandian_Stores(30,"Colgate");//error line
	Pandian_Stores sweet = new Pandian_Stores();
	

}
}