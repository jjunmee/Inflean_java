package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"학생1","학생2","학생3"};
        int[] studentAges = {15,16,15};
        int[] studentGrades = {90,80,95};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름:" + studentNames[i] + " 나이:" + studentAges[i] + " 성 적:" + studentGrades[i]);
        }
    }
}
