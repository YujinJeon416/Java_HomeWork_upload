package shape;
public class ShapeTest {
	public static void main(String[] args) {
		
		Shape[] array = new Shape[] {
				new Triangle(7,5,"Blue"),
				new Rectangle(4,6,"Blue"),
				new Triangle(6,7,"Red"),
				new Rectangle(8,3,"Red"),
				new Triangle(9,8,"White"),
				new Rectangle(5,7,"White")
		};
		
		System.out.println("기본정보");
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%s\t%.1f\t%s\t%n",
					array[i].getClass().getSimpleName(),array[i].getArea(), array[i].getColors());
		}
		
		System.out.println("\n사이즈를 변경 후 정보");
		for(int i = 0; i < array.length; i++) {
			if(array[i] instanceof Triangle) {
				((Triangle)array[i]).setResize(5);
			}else if(array[i] instanceof Rectangle) {
				((Rectangle)array[i]).setResize(5);
			}
			System.out.printf("%s\t%.1f\t%s\t%n",
					array[i].getClass().getSimpleName(),array[i].getArea(), array[i].getColors());
		}
	}
}
