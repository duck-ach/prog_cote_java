package prog240319;

public class ThenTwoNumber {

    /**
     * 숫자 비교하기
     * 두 수가 같다면 return 1
     * 두 수가 다르다면 return -1
     */

    class Solution {
        public int solution(int num1, int num2) {

            int answer = 0;

            if(num1 == num2) {
                answer = 1;
            } else {
                answer = -1;
            }

            return answer;
        }
    }

}
