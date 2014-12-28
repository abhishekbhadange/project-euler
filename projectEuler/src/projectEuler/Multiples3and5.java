package projectEuler;

public class Multiples3and5 {
	public static void main(String[] args) {
		System.out.println("Sum of multiples of 3 and 5 below 1000: " + multiples3and5());
	}
	private static int multiples3and5() {
		int sum = 0;
		for(int i = 1; i < 1000; i++) {
			if((i % 3 == 0) || (i % 5 == 0)) 
				sum = sum + i;
		}
		return sum;
	}
}
