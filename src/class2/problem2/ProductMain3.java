package class2.problem2;

import java.util.Scanner;
public class ProductMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력할 주문의 개수를 입력하세요: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        ProductOrder3[] orders = new ProductOrder3[n];

        for (int i = 0; i < orders.length; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");
            System.out.println("상품명: ");
            String productName = scanner.nextLine();

            System.out.println("가격: ");
            int price = scanner.nextInt();

            System.out.println("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            orders[i] = createOrder(productName, price, quantity);
        }

        printOrders(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalAmount);
    }

    static ProductOrder3 createOrder(String productName, int price, int quantity) {
        ProductOrder3 order1 = new ProductOrder3();
        order1.productName = productName;
        order1.price = price;
        order1.quantity = quantity;
        return order1;
    }
    static void printOrders(ProductOrder3[] orders) {
        for (ProductOrder3 order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " +
                    order.price + ", 수량: " + order.quantity);
        }
    }
    static int getTotalAmount(ProductOrder3[] orders){
        int totalAmount = 0;
        for (ProductOrder3 order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
