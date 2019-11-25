import java.util.Scanner;

public class Life {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Spalten:");
		int cc = sc.nextInt();
		System.out.println("Reihen:");
		int rc = sc.nextInt();
		
		boolean[][] arr = new boolean[rc][cc];
		int mod = 2;
		String res = "";
		
		for(int r = 0; r < arr.length; ++r) {
			int c;
			for(c = 0; c < arr[r].length; ++c) {
				arr[r][c] = c % mod == 0;
				res += arr[r][c] ? "T" : "F";
			}
			res+= "\n";
			c = 0;
			++mod;
		}
		System.out.println(res);
	}
}
