package ncs.test5;

public class Book {
	private String title;
	private String author;
	private int price;
	private String publisher;
	private double discountRate;

	public Book() {
		super();
	}

	public Book(String title, String author, String publisher, int price,  double discountRate) {
		super();
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.discountRate = discountRate;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}

	public String getPublisher() {
		return publisher;
	}

	public double getDiscountRate() {
		return discountRate;
	}

}
