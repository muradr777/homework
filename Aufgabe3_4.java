import java.util.Scanner;

public class Aufgabe3_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1, cnt = 4, max = 0;
		while(i < cnt) {
			System.out.println("Zahl " + i + ":");
			int inpt = sc.nextInt();
			if(i == 1) { 
				max = inpt;
			} 

			max = inpt > max ? inpt : max;
			i++;
		}
		System.out.println("Max ist: " + max);
	}
}
