public class Fibonacci {
	public static void main(String[] args) {
		int a = 1, b = 1, sum = 0;
		System.out.print(a + ", ");
		while(sum < 20) {
			sum = a + b;
			b = sum;
			System.out.print(sum + ", ");
		}
	}
}
