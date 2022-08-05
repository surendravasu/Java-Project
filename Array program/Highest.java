
public class Highest {
	
	public static void main(String args[]) {
		int[] arr = new int[] {90,76,96,105, 80};
		int highest = arr[0];
		int secondHighest = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > highest) {
				secondHighest = highest;
				highest = arr[i];
			} else if(arr[i] > secondHighest) {
				secondHighest = arr[i];
			}
		}
		System.out.println("Highest value --->   " +highest);
		System.out.println("Second Highest value --->   " +secondHighest);
	}

}
