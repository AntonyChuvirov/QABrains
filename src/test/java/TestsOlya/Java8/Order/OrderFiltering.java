package TestsOlya.Java8.Order;

import java.util.List;

public class OrderFiltering {
    List<Order> orderList;

    OrderFiltering(List<Order> orderList) {
        this.orderList = orderList;
    }

    public void printVegan() {
        for (Order order : orderList) {
            if (order.isVegan) {
                System.out.println(order);
            }
        }
    }

    public void printPriceLessThan300() {
        for (Order order : orderList) {
            if (order.price < 300) {
                System.out.println(order);
            }
        }
    }
}