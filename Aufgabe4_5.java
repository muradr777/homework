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
		int r = 0, c = 0;
		String res = "";
		
		while(r < arr.length) {
			while(c < arr[r].length) {
				arr[r][c] = c % mod == 0;
				res += arr[r][c] ? "T" : "F";
				++c;
			}
			res+= "\n";
			c = 0;
			++r;
			++mod;
		}
		System.out.println(res);
	}
}
