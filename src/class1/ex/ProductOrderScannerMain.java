package class1.ex;

import java.util.Scanner;

public class ProductOrderScannerMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 여러 상품의 주문 정보를 담는 배열 생성
        // 상품 주문 정보를 `ProductOrder` 타입의 변수로 받아 저장

        System.out.print("상품 갯수 : ");
        ProductOrder[] productOrders = new ProductOrder[scanner.nextInt()];
        scanner.nextLine();

        for (int i = 0; i < productOrders.length; i++) {
            productOrders[i] = new ProductOrder();

            System.out.print("상품명 : ");
            productOrders[i].productName = scanner.nextLine();
            System.out.print("가격 : ");
            productOrders[i].price = scanner.nextInt();
            System.out.print("갯수 : ");
            productOrders[i].quantity = scanner.nextInt();
            scanner.nextLine();
        }

        int totalPrice = 0;
        // 상품 주문 정보와 최종 금액 출력
        for (ProductOrder productOrder : productOrders)  {
            System.out.println("상품명 : " + productOrder.productName + ", 가격 : " + productOrder.price + ", 수량 : " + productOrder.quantity);
            totalPrice += productOrder.price * productOrder.quantity;
        }
        System.out.println("총 결제 금액 : " + totalPrice);
    }
}
