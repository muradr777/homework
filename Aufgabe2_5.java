public class Aufgabe2_5 {
	public static void main(String[] args) {
		boolean a = true, b = false, c = false;
		if(a || b)
			b = true;
		else
			c = true;
		a = b && c;
		c = !a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
