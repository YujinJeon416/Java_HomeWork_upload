package Workshop4;

/*
 * [ 문제1] 다음과같은조건을만족하는프로그램을작성하시오
 * 1. 조건2차원배열arr2에담긴모든값의총합과평균을구하는프로그램을작성하시오.
 * 합과평균은정수형으로평균은실수형으로출력하시오.
 * int[][] arr2 = {
 * { 5, 5},
 * {10,10,10,10,10},
 * {20,20,20},
 * {30,30,30,30}
 * };
 * 
 */

public class Test01 {
	
 public static void main(String[] args){
	
			int[][] arr2 = {
				{5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20},
				{30, 30, 30, 30}
			};
			int count = 0;
			int total = 0;
			double average = 0.0;
			for (int i = 0; i < arr2.length; i++) {
				for (int j = 0; j < arr2[i].length; j++) {
					total += arr2[i][j];
					count++;
				}
			}
			average = (double)total/count;
			System.out.println("total=" + total);
			System.out.println("average=" + String.format("%.1f",average));
		}
	}

		  
	

