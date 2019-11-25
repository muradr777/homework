import java.util.Scanner;
public class A605_rhombus{
	public static void draw(int height) {
		int step = 0;
		String ups = "";
		boolean even = height % 2 == 0;
		height = even ? ++height : height;
		int center = height/2;
		for(int y = 0; y < height; ++y) {
			for(int x = 0; x < height; ++x) {
				if(x >= center-step && x <= center+step && !(y == center && x == center && even)) {
					System.out.print("X");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			if(y < center) 
				++step;
			else
				--step;
		}
	}

	public static void main(String[] args) {
		System.out.print("Geben Sie die Höhe der Raute ein : ");
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		draw(height);	
	}
}
