package Task1_jv8;

import java.time.LocalDate;
import java.util.List;

public class Order {
	private String id;
	private String customer;
	private String employee;
	private LocalDate date;
	List<OrderItem> items;
	public Order(String id, String customer, String employee, LocalDate date, List<OrderItem> items) {
		super();
		this.id = id;
		this.customer = customer;
		this.employee = employee;
		this.date = date;
		this.items = items;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getEmployee() {
		return employee;
	}
	public void setEmployee(String employee) {
		this.employee = employee;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public List<OrderItem> getItems() {
		return items;
	}
	public void setItems(List<OrderItem> items) {
		this.items = items;
	}
}
