public class Aufgabe3_1 {
	public static void main(String[] args) {
		int a = 15, b = 4;
		float f1 = a, f2 = b;
		int i = 1;
		int ggt = 0;		
		
		if(a < 1 && b < 1) {
			System.out.println("Fehler");
			System.exit(0);
		}
		while(i <= a) {
			if((a / i) - (f1 / i) == 0) {
				if((b / i) - (f2 / i) == 0) {
					ggt = i;
				}
			}
			i++;
		}
		System.out.println("GGT: " + ggt);
		System.out.println("KGV: " + (a*b) / ggt );
	}
}

