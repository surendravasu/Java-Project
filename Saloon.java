class Saloon
{
	Saloon() {
		System.out.println("This is default constructor");
	}
	
	Saloon(String saloonName, String location) {
		this();
		System.out.println("Saloon Name = "+saloonName);
		System.out.println("Location = "+location);
	}
	
	Saloon(int shaving, int haircutAmt, int facialAmt) {
		this("Malar Saloon", "Chinnalapatti");
		System.out.println("Shaving = " +shaving);
		System.out.println("Haircut = " +haircutAmt);
		System.out.println("Facial = " +facialAmt);
	}
		
	public static void main(String[] args){
		Saloon sal = new Saloon(50, 150, 100);
		
	}
}
