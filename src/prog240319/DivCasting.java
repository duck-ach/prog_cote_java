package prog240319;

public class DivCasting {

    /**
     * num1을 num2로 나눈 후 1000을 곱한 정수를 return 하는 문제
     * 형 변환이 문제의 요점이다.
     */
    class Solution {
        public int solution(int num1, int num2) {
            double answer = (double) num1 / num2 * 1000;
            return (int)answer;
        }
    }

}
