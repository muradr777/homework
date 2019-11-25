import java.util.Scanner;
public class A604_pyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Geben Sie die Höhe der Pyramide ein : ");
		int height = sc.nextInt();
		int cnt = 0;
		for(int y = 0; y < height; ++y) {
			for(int x = 0; x < height*2; ++x) {
				if(x >= height-cnt && x <= height+cnt)
					System.out.print("X");
				else
					System.out.print(" ");
			}
			++cnt;
			System.out.println();
		}
	}
}
