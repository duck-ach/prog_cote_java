package prog250511;

import java.util.Arrays;

public class DupNumCount {
    public static void main(String[] args) {
        int[] testArray = {1, 1, 2, 3, 4, 5};
        int testNum = 1;
        solution(testArray, testNum);
    }
    public static int solution(int[] array, int n) {
        return (int) Arrays.stream(array).filter(num -> num == n).count();
    }
}
