package access.ex;

public class CounterMain {
    public static void main(String[] args) {
        MaxCounter counter = new MaxCounter(3);
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment(); //최대값을 초과 할 수 없습니다.
        int count = counter.getCount();
        System.out.println(count); //3
    }
}
