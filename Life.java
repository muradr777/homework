uimport java.lang.Math;

public class Life {
	public static boolean getRandBool() {
		return Math.random() < 0.5;
	}

	public static void draw(boolean[][] arr) {
		String res = "";
		for(int y = 0; y < arr.length; ++y) {
                        for(int x = 0; x < arr[y].length; ++x) {
                                res += arr[y][x] + "\t";
                        }
                        res += "\n";
                }
		System.out.println(res);
	}
	public static void main(String[] args) {
		boolean[][] arr = new boolean[5][5];
		for(int y = 0; y < arr.length; ++y) {
			for(int x = 0; x < arr[y].length; ++x) {
				arr[y][x] = getRandBool();
			}
		}
		draw(arr);
		for(int y = 0; y < arr.length; ++y) {
                        for(int x = 0; x < arr[y].length; ++x) {
                        	for(int k = y-1; k < y+1; ++k) {
					for(int j = x-1; j < x+1; ++j) {
						
					}					
				}
			}
                }		
	}
}
