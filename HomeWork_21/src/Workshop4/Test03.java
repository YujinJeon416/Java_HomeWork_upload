package Workshop4;
/*
 * 다음배열의내용을실행결과와같이출력되도록프로그램을작성하시오.
 * int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
 * 출력은아래와같이이루어진다.
 * 100 90 80 70 60 50 40 30 20 10
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

	public class Test03 {
		public static void main(String[] args) {
			int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
			List<Integer>list = new ArrayList<Integer>();
			for(int i =0; i<arr.length; i++)
				list.add(arr[i]);
			Collections.sort(list, (i,j)->{return j-i;});
			Iterator<Integer> itr = list.iterator();
			while(itr.hasNext()) {
				System.out.print(itr.next() + " ");
			}
		}
	}


