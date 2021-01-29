package Workshop4;
/*
 * 프로그램실행시eclipse argument로5~10까지의정수형데이터를입력받는다.
 * 입력받은정수값을Calc class의calculate()함수를이용하여1부터입력받은숫자까지짝수만더하는프로그램을작성한다.
 * 출력은아래와같이이루어진다.
 * 입력값: 5
 * 짝수: 2 4  결과: 6
 */
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력값: ");
		int data =sc.nextInt();
		Calc c = new Calc();
		c.calculate(data);
	}
}
