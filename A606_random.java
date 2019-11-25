import java.util.Random;
public class A606_random {
	public static int getRand() {
		Random rand = new Random();
		return rand.nextInt(90) + 10;
	}

	public static int getSum(int [][] arr) {
		int sum = 0;
		for(int y = 0; y < arr.length; ++y) {
			for(int x = 0; x < arr[y].length; ++x) {
				sum += arr[y][x];	
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int [][] arr = new int[6][6];
		for(int y = 0; y < arr.length; ++y) {
			for(int x = 0; x < arr[y].length; ++x) {
				arr[y][x] = getRand();
			}
		}
		System.out.println("Die Summe von Zufallszahlen ist: " + getSum(arr));
	}
}

