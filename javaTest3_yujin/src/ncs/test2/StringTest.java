package ncs.test2;

public class StringTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "1.22,4.12,5.93,8.71,9.34";
		double data[] = new double[5];
		double sum = 0;
		int count = 0;
		
		String[] st = str.split(",");
		 for(String s : st){
			 data[count] = Double.parseDouble(s);
			 sum += data[count];
			 count++;
		}
		 double avg = sum / count;
		 System.out.printf("합계 : %.3f\n평균 : %.3f",sum,avg);
	}

}
