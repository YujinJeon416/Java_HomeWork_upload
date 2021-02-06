package workshop5;

public class Test03 {
	public static void main(String[] args) {
		int[][] arr2 = {
				{20, 30, 10},
				{50, 40, 60},
				{80, 80, 90}};
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(
						arr2[arr2.length-(i+1)][arr2[i].length-(j+1)] + " ");
			}
		}
	}
}