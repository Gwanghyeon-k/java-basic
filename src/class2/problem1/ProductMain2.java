package class2.problem1;

public class ProductMain2 {
    public static void main(String[] args) {
        ProductOrder2[] orders = new ProductOrder2[3];
        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김치", 5000, 2);
        orders[2] = createOrder("콜라", 1500, 1);

        printOrders(orders);
        int totalAmount = getTotalAmout(orders);
        System.out.println("총 결제 금액: " + totalAmount);
    }

    static ProductOrder2 createOrder(String productName, int price, int quantity){
        ProductOrder2 order = new ProductOrder2();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder2[] orders) {
        for(ProductOrder2 order : orders) {
            System.out.println("상품명" + order.productName + ", 가격" + ""
                    + order.price + ", 수량" + order.quantity);
        }
    }

    static int getTotalAmout(ProductOrder2[] orders) {
        int totalAmount = 0;
        for(ProductOrder2 order : orders) {
            totalAmount += order.price*order.quantity;
        }
        return totalAmount;
    }
}
