import java.util.Scanner;
public class MethodenParams {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Breite ?");
		int breite = sc.nextInt();
		rechteck(breite);
	}
	public static void rechteck(int iBreite) {
		obereUnteneKanten(iBreite);
		for(int y = 0; y < 5; ++y) {		
			System.out.print("|");			
			for(int k = 0; k < iBreite; ++k) {
				System.out.print(" ");
			}
			System.out.print("|");
			System.out.println();
		}
		obereUnteneKanten(iBreite);
	}
	public static void obereUnteneKanten(int iBreite) {
		System.out.print("+");
                for(int i = 0; i < iBreite; ++i) {
                        System.out.print("-");
                }
                System.out.print("+");
		System.out.println();
	}
}
