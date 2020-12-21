package test.controller;

public class Test2 {

	public static void main(String[] args) {
		for(int dan = 2; dan <= 5; dan++){
			for(int su = 1; su < 10; su++){
				int result = dan * su;
				if(result % 2 == 1)
					System.out.println(dan + "*" + su + "=" + result);
			}
		}

	}

}
