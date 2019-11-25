public class Aufgabe4_4 {
	public static void main(String[] args) {
		int sum = 0;
		for( int i = 1; i < 101; ++i ) {
			sum+=i;
			System.out.print(sum + "\t");
			
			if( i % 10 == 0 ) {
				System.out.print("\n");
			}
		}
	}
}
