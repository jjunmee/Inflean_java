package static2.ex;

public class Car {
    private static int carCnt;
    private String carNm;

    public Car(String carNm) {
        System.out.println("차량 구입, 이름 : " + carNm);
        this.carNm = carNm;
        carCnt++;
    }

    public static void showTotalCars(){
        System.out.println("구매한 차량 수 : " + carCnt);
    }
}
