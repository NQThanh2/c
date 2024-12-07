package Task1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Tạo các sản phẩm
        Product product1 = new Product("Coca-Cola", "Nước giải khát", 15.0, LocalDate.of(2025, 12, 31)); // Đảm bảo ngày hết hạn là đúng
        Product product2 = new Product("Bánh quy", "Đồ ăn vặt", 10.0, LocalDate.of(2024, 5, 1)); // Đảm bảo ngày hết hạn là đúng
        Product product3 = new Product("Kem", "Đồ đông lạnh", 20.0, LocalDate.of(2024, 6, 15)); // Đảm bảo ngày hết hạn là đúng
        Product product4 = new Product("Nước suối", "Nước giải khát", 5.0, LocalDate.of(2024, 7, 1)); // Đảm bảo ngày hết hạn là đúng

        // Tạo các chi tiết hóa đơn
        OrderItem item1 = new OrderItem(product1, 2); // 2 chai Coca-Cola
        OrderItem item2 = new OrderItem(product2, 5); // 5 bánh quy
        OrderItem item3 = new OrderItem(product3, 1); // 1 hộp kem
        OrderItem item4 = new OrderItem(product4, 3); // 3 chai nước suối

        // Tạo các hóa đơn
        List<OrderItem> orderItems1 = new ArrayList<>();
        orderItems1.add(item1);
        orderItems1.add(item2);
        Order order1 = new Order("Nguyễn Văn A", LocalDate.of(2024, 12, 7), "Lê Thị B", orderItems1);

        List<OrderItem> orderItems2 = new ArrayList<>();
        orderItems2.add(item3);
        orderItems2.add(item4);
        Order order2 = new Order("Trần Thị C", LocalDate.of(2024, 12, 6), "Nguyễn Văn D", orderItems2);

        List<OrderItem> orderItems3 = new ArrayList<>();
        orderItems3.add(item1);
        orderItems3.add(item4);
        Order order3 = new Order("Phạm Minh E", LocalDate.of(2024, 12, 7), "Lê Thị F", orderItems3);

        // Danh sách các hóa đơn
        List<Order> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);

        // Khởi tạo OrderManager
        OrderManager orderManager = new OrderManager();

        // 1. Tìm sản phẩm có giá bán cao nhất
        Product maxProduct = orderManager.maxProduct(List.of(product1, product2, product3, product4));
        System.out.println("Sản phẩm có giá bán cao nhất: " + maxProduct.getName() + " với giá: " + maxProduct.getPrice());

        // 2. Thống kê loại sản phẩm và số lượng bán ra cho mỗi loại
        HashMap<String, Integer> statistics = orderManager.productTypesStatistics(orders);
        System.out.println("Thống kê loại sản phẩm:");
        for (Map.Entry<String, Integer> entry : statistics.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " sản phẩm");
        }

        // 3. Sắp xếp các hóa đơn theo giá trị giảm dần
        TreeSet<Order> sortedOrders = orderManager.ordersByCost(orders);
        System.out.println("\nDanh sách hóa đơn sắp xếp theo giá trị:");
        for (Order order : sortedOrders) {
            System.out.println("Hóa đơn của khách " + order.getCustomer() + " với tổng giá trị: " + order.getTotalCost() +
                    ", Ngày lập: " + order.getDate());
        }
    }
}
