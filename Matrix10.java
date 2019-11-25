public class Matrix10 {
	static int arr [][] = new int [10][10];
	public static void main(String[] args) {
		int cnt = 0;
		for (int y = 0; y < arr.length; ++y) {
			for(int x = 0; x < arr[y].length; ++x) {						
				arr[y][x] = cnt;
				++cnt;
			}
		}
		arrAusgabe();
	}
	public static void arrAusgabe() {
		for(int y = 0; y < arr.length; ++y) {
			for(int x = 0; x < arr[y].length; ++x) {
				System.out.print(arr[y][x] + "\t");
			}
			System.out.println();
		}
	}
}
