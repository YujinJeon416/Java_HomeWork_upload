package Workshop4;
/*
 * 1)eclipse Argument 에서1~5까지의두개의정수형데이터를입력받아2차원배열을만든다.
 * 2) 입력받은데이터가2개미만또는2개초과로입력하면“다시입력하세요”출력
 * 3) 1~5이외의숫자가입력될경우“숫자를확인하세요”출력
 * 4) 입력받은두개의정수를이용하여2차원배열을생성한다.
 * 5) 2차원배열에1~5까지의랜덤한숫자(중복허용)를넣는다.
 * 6) 배열의내용을출력한다.
 * 7) 배열의총합과평균을출력한다.
 */
import java.util.Random;
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1=0,n2=0;
		System.out.print("두개의 정수입력(1~5): ");
		n1=sc.nextInt();
		n2=sc.nextInt();
		if(n1<1 || n1>5 || n2<1 || n2>5) {
			System.out.println("숫자를 확인하세요.");
			return;
		}
		double sum=0;
		int [][]arr = new int[n1][n2];
		for(int i =0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = (new Random()).nextInt(5)+1;
				sum+=arr[i][j];
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.printf("sum=%.1f\n", sum);
		System.out.printf("avg=%.1f\n", sum/(n1*n2));
	}

}
