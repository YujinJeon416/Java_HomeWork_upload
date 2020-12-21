package test.controller;

public class Test10 {

	public static void main(String[] args) {
		int[][] array = {
			{12, 41, 36, 56}, 
			{82, 10, 12, 61}, 
			{14, 16, 18, 78}, 
			{45, 26, 72, 68}
		};
		//3의 배수가 몇개인지 알수 없으므로 최대크기의 배열을 우선 생성한다.
		int[] copyArr = new int[array.length * array[0].length];
		int copyIndex = 0;
		
		for(int i = 0; i < array.length; i++){
			
			abc:
			for(int j = 0; j < array[i].length; j++){
				//3의 배수검사
				if(array[i][j] % 3 == 0){
					//중복검사 : 중복된 수가 있다면, copyArr에 담지 않는다.
					for(int k = 0; k < copyIndex; k++){
						if(copyArr[k] == array[i][j]){
							continue abc;
						}
					}
					copyArr[copyIndex++] = array[i][j];
//					System.out.println(copyIndex+" : "+Arrays.toString(copyArr));
				}		
			}
		}
		
		//출력
		System.out.print("copyArr =[");
		for(int i = 0; i < copyIndex; i++)
			System.out.print(copyArr[i]+(i!=copyIndex-1?", ":""));
		System.out.println("]");
	}

}
