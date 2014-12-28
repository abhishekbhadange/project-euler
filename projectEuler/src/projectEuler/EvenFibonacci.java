package projectEuler;

public class EvenFibonacci {
	public static void main(String[] args) {
		System.out.println("Sum of even fibonacci numbers below 4 million: " + evenFibonacci());
	}
	private static int evenFibonacci() {
		int sum = 0, previous = 1, current = 2;
		int next = previous + current;
		if(previous % 2 == 0)
			sum += previous;
		if(current % 2 == 0)
			sum += current;
		while(next < 4000000) {
			if(next % 2 == 0)
				sum += next;
			previous = current;
			current = next;
			next = previous + current;
		}
		return sum;
	}
}
