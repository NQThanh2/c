package Task1;

import java.time.LocalDate;

public class Product {
	private String name;
	private String type;
	private int price;
	private LocalDate expiredDate;
	public Product(String name, String type, int price, LocalDate expiredDate) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
		this.expiredDate = expiredDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public LocalDate getExpiredDate() {
		return expiredDate;
	}
	public void setExpiredDate(LocalDate expiredDate) {
		this.expiredDate = expiredDate;
	}
	public Product getMax(Product p1, Product p2) {
		if (p1.getPrice() > p2.getPrice())
			return p1;
		else
			return p2;
	}
}
