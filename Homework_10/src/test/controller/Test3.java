package test.controller;

public class Test3 {

	public static void main(String[] args) {
		double sum = 0.0, avg = 0.0;
		int n = 1;
		
		while(n <= 100){
			sum += n;
			n++;
		}
		
		System.out.println("합계 : "+ sum);
		System.out.println("평균 : " + (sum / 100));		
	}

}
