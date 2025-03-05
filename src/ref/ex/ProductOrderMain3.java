package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 여러 상품의 주문 정보를 담는 배열 생성
        System.out.print("상품 갯수 : ");
        ProductOrder[] productOrders = new ProductOrder[scanner.nextInt()];
        scanner.nextLine();

        // createOrder()를 여러번 사용해서 상품 주문 정보들을 생성하고 배열에 저장
        for (int i = 0; i < productOrders.length; i++) {
            System.out.println(i + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명 : ");
            String name = scanner.nextLine();
            System.out.print("가격 : ");
            int price = scanner.nextInt();
            System.out.print("갯수 : ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            productOrders[i] = createOrder(name, price, quantity);
        }

        printOrders(productOrders);

        System.out.println("총 결제 금액 : " + getTotalAmount(productOrders));
    }

    //ProductOrder` 를 생성하고 매개변수로 초기값을 설정합니다. 마지막으로 생성한 `ProductOrder` 를 반환합니다.
    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;

        return productOrder;
    }

    //배열을 받아서 배열에 들어있는 전체 `ProductOrder` 의 상품명, 가격, 수량을 출력합니다.
    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder po : orders) {
            System.out.println("상품명 : " + po.productName + ", 가격 : " + po.price + ", 수량 : " + po.quantity);
        }
    }

    //배열을 받아서 배열에 들어있는 전체 `ProductOrder` 의 총 결제 금액을 계산하고, 계산 결과를 반환합니 다.
    static int getTotalAmount(ProductOrder[] orders) {
        int totalPrice = 0;
        // 상품 주문 정보와 최종 금액 출력
        for (ProductOrder po : orders) {
            totalPrice += po.price * po.quantity;
        }

        return totalPrice;
    }
}
