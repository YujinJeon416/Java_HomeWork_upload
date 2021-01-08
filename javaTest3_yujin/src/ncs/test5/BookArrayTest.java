package ncs.test5;

public class BookArrayTest {
	public static void main(String[] args) {
		Book bArray[] = new Book[3];
		bArray[0]=new Book("자바의 정석", "남궁성", "도우출판", 30000, 0.1);
		bArray[1]=new Book("열혈강의 자바", "구정은", "프리렉", 29000, 0.1);
		bArray[2]=new Book("객체지향 JAVA8", "금영욱","북스홈", 30000, 0.1);

		for(int i=0;i<bArray.length;i++){
			System.out.println(bArray[i].getTitle()+", "+bArray[i].getAuthor()+", "+bArray[i].getPublisher()+", "+bArray[i].getPrice()+"원, "+(int)(bArray[i].getDiscountRate()*100)+"% 할인");
			System.out.println("할인된 가격 : "+(int)(bArray[i].getPrice()-(bArray[i].getPrice()*bArray[i].getDiscountRate()))+"원");
		}
	}
}
