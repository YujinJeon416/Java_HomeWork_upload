package Workshop4;
/*
 * eclipse에서argument로1~5까지의정수형데이터하나를입력받아입력받은수부터10까지합을구한다.
 * 단, 3의배수와5의배수는합에서제외한다.
 */
import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력(1~5): ");
		int num = sc.nextInt();
		int sum=0;
		if(num<1 || num>5) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		String result = "";
		for(int i=num; i<=10; i++) {
			if(i%3!=0 && i%5!=0) {
				sum+=i;
				result+=(i+"+");
			}
		}
		System.out.println(result.substring(0,result.length()-1));
		System.out.println("결과: " + sum);
	}
}
