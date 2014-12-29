package projectEuler;

public class LargestPrimeFactor {
	public static void main(String[] args) {
		long n = 600851475143L;
		System.out.println("Largest prime factor of " + n + " is: " + largestPrimeFactor(n));
	}
	private static long largestPrimeFactor(long number) {
		int i;
    	for (i = 2; i <= number; i++) {
        	if (number % i == 0) {
            	number /= i;
            	i--;
        	}
    	}
    	return i;
	}
}