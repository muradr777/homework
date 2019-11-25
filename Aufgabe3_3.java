import java.util.Scanner;

public class Life {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Spalten:");
		int cCnt = sc.nextInt();
		System.out.println("Reihen:");
		int rCnt = sc.nextInt();
		int mod = 2;
		int r = 0, c = 0, i = 0;

		while(r < rCnt) {
			while(c < cCnt) {
				if(c % mod == 0) {
					System.out.print("X");
				} else {
					System.out.print("_");
				}
				c++;
			}
			System.out.println();
			c = 0;
			r++;
			mod++;
		}
	}
}
