package school;

public class StudentTest {
	
	public static void main(String[] args) {
		double sumAge = 0;
		double sumHgt = 0;
		double sumWgt = 0;
		
		Student[] array = new Student[] {
				new Student("홍길동",15,171,81),
				new Student("한사람",13,183,72),
				new Student("임걱정",16,175,65)
		};
		System.out.printf("이름\t나이\t신장\t몸무게%n");
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d%n",
					array[i].getName(), array[i].getAge(),
					array[i].getHeight(), array[i].getWeight());
			sumAge += array[i].getAge();
			sumHgt += array[i].getHeight();
			sumWgt += array[i].getWeight();
		}
		System.out.println("\n");
		System.out.printf("나이의 평균 : %.2f%n", sumAge/3.0);
		System.out.printf("신장의 평균 : %.2f%n", sumHgt/3.0);
		System.out.printf("몸무게의 평균 : %.2f%n", sumWgt/3.0);
		
	}
}
