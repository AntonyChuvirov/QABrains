package TestsOlya.Java8.Order;

public class Order {
    int price;
            boolean isVegan;
            String custumerName;

    public Order(int price, boolean isVegan, String custumerName) {
        this.price = price;
        this.isVegan = isVegan;
        this.custumerName = custumerName;
    }
    @Override
    public String toString(){
        return "your order price is" + price +", is vegan& -" + isVegan + ", customer name is" + custumerName;}
}
