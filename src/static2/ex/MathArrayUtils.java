package static2.ex;

import access.ex.MaxCounter;

public class MathArrayUtils {
    private MathArrayUtils(){
        //private 인스턴스 생성을 막는다.
    }

    public static int sum(int[] values){
        int value = 0;
        for (int i = 0; i < values.length; i++) {
            value += values[i];
        }
        return value;
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        int value = values[0];
        for (int i = 0; i < values.length; i++) {
            if(values[i] < value){
                value = values[i];
            }
        }
        return value;
    }

    public static int max(int[] values) {
        int value = values[0];
        for (int i = 0; i < values.length; i++) {
            if(values[i] > value){
                value = values[i];
            }
        }
        return value;
    }
}
