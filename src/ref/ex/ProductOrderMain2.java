package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] productOrders = new ProductOrder[3];

        // createOrder()를 여러번 사용해서 상품 주문 정보들을 생성하고 배열에 저장
        productOrders[0] = createOrder("두부", 2000, 2);
        productOrders[1] = createOrder("김치", 5000, 1);
        productOrders[2] = createOrder("콜라", 1500, 2);

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
