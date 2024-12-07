package Task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.time.LocalDate;

public class OrderManager {
	List<Order> orders;

	public OrderManager(List<Order> orders) {
		super();
		this.orders = orders;
	}
	// 1
	public Product maxProduct() {
		Product maxProduct = null;
		double maxPrice = 0;
		for(Order order : orders) {
			for(OrderItem item : order.getItems()) {
				Product product = item.getItem();
				if(product.getPrice()>maxPrice) {
					maxPrice = product.getPrice();
					maxProduct = product;
				}
			}
		}
		return maxProduct;
	// 2
	HashMap<String, Integer> productTypesStatistics(){
		
	}
	}
	public static void main(String[] args) {
		Product product1 = new Product("Coca-Cola", "Nước giải khát", 15, LocalDate.of(2025, 12, 31));
        Product product2 = new Product("Bánh quy", "Đồ ăn vặt", 10, LocalDate.of(2024, 5, 1));
        Product product3 = new Product("Kem", "Đồ đông lạnh", 20, LocalDate.of(2024, 6, 15));
        Product product4 = new Product("Nước suối", "Nước giải khát", 5, LocalDate.of(2024, 7, 1));
        
        OrderItem item1 = new OrderItem(product1, 2);
        OrderItem item2 = new OrderItem(product2, 5);
        OrderItem item3 = new OrderItem(product3, 1);
        OrderItem item4 = new OrderItem(product4, 3);
        
        List<OrderItem> orderItems1 = new ArrayList<>();
        orderItems1.add(item1);
        orderItems1.add(item2);
        Order order1 = new Order("1","N", "L", LocalDate.of(2024, 12, 7), orderItems1);

        List<OrderItem> orderItems2 = new ArrayList<>();
        orderItems2.add(item3);
        orderItems2.add(item4);
        Order order2 = new Order("2","T", "N", LocalDate.of(2024, 12, 6), orderItems2);

        List<OrderItem> orderItems3 = new ArrayList<>();
        orderItems3.add(item1);
        orderItems3.add(item4);
        Order order3 = new Order("3","P", "L", LocalDate.of(2024, 12, 7), orderItems3);
        
        List<Order> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        
        OrderManager orderManager = new OrderManager(orders);
        Product maxProduct = orderManager.maxProduct();
        
        if (maxProduct != null) {
            System.out.println("Sản phẩm có giá cao nhất là: " + maxProduct.getName() +
                    " với giá: " + maxProduct.getPrice());
        } else {
            System.out.println("Không tìm thấy sản phẩm.");
        }
	}
}
