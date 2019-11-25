import java.util.Scanner;
public class Aufgabe4_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Geben Sie Vierstelliges Jahr ein:");
		int year = sc.nextInt();
		String res = "kein Schaltjahr";
		
		if( year < 1000) {
			System.out.println("Muss Vierstelliges sein.");
			System.exit(0);
		}
		if( year % 400 == 0 || year % 4 == 0 && year % 100 != 0 ) {
				res = "Schaltjahr";		
		}
		System.out.println(res);
	}
}
