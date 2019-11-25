public class Aufgabe5_2 {
	// Rational
	public static void main(String[] args) {
		int[] arr = new int [2];
		arr[0] = 4;
		arr
	}

	public function ggT(a, b) {
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
		return ggt;
	}
}
