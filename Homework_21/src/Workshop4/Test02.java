package Workshop4;
/*
 * 다음과같이선언되어있는배열에1~10까지의랜덤한숫자(중복허용)를넣고이배열에어떤값이셋팅되었는지출력하고배열데이터의합과평균을구하는프로그램을작성하시오.
 * int[] arr3 = new int[5]option: 랜덤한숫자의중복허용을하지않게배열에입력한다.
 * 합은 정수형으로 평균은 실수형으로 출력하시오.
 */

public class Test02 {
	public static void main(String[] args) {
		int[] arr3 = new int[5];
		int sum = 0;
		double avg = 0.0;
		int tmp = 0;
		boolean flg;
		
		for (int i = 0; i < arr3.length; i++) {
			
			flg = true;
			
			while (flg) {
				
				tmp = (int)(Math.random()*10) + 1;
				
				for(int j = 0; j <= i; j++) {
					if(tmp == arr3[j]) {
						flg = true;
						break;
					}
					if(i == j) {
						flg = false;
						arr3[i] = tmp;
					}
				}
			}
		}
		
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
			sum += arr3[i];
		}
		
		avg = (double)sum / arr3.length;
		
		System.out.println("\nsum=" + sum);
		System.out.println("avg=" + avg);
	}
}


