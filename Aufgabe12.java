public class Aufgabe12 {
	public static void main(String[] args) {
		int i = 0;
		int[] arr = {2, 23, 4, 8, 11};
		int max = arr[0];
		while(i < arr.length) {
			if(max < arr[i]) {
				max = arr[i];
			}
			i++;
		}
		System.out.println(max);
	}
}