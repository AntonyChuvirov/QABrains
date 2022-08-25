package TestsOlya.Java8.Order;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class TestOrder {
    @Test
    public void checkOrders() {
        Order firstOrder = new Order(250, false, "Vadym");
        Order secondOrder = new Order(150, true, "Oleg");
        Order thirdOrder = new Order(440, false, "Igor");
        Order fourthOrder = new Order(50, true, "Alex");
        Order fifthOrder = new Order(550, true, "Irina");
        Order sixthOrder = new Order(690, false, "Fred");
        Order seventhOrder = new Order(770, false, "Jack");
        Order eighthOrder = new Order(25, true, "Lina");

        List<Order> orderList = Arrays.asList(firstOrder, secondOrder, thirdOrder, fourthOrder, fifthOrder, sixthOrder, seventhOrder, eighthOrder);
//   printCondition(orderList, new CheckVegan());
//   printCondition(orderList, new CheckPriceMoreThan100());
    printCondition(orderList, order -> order.price < 400 && order.isVegan);

    }

public void printCondition(List<Order> orderList, OrderCheck orderCheck){
        for (Order order : orderList){
            if (orderCheck.checkConditions(order)){
                System.out.println(order);
            }
        }
}
}



//for (Order order : orderList){
//    System.out.println(order);
//    OrderFiltering orderFiltering = new OrderFiltering(orderList);
//    orderFiltering.printVegan();
//    orderFiltering.printPriceLessThan300();
