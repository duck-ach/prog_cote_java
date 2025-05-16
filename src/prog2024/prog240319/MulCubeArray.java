package prog2024.prog240319;

public class MulCubeArray {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = {1, 2, 4, 6, 7};
        int[] answer = solution.solution(array);

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }

    static class Solution {
        public int[] solution(int[] numbers) {

            int[] answer = new int[numbers.length];

            for(int i = 0; i < numbers.length; i++) {
                answer[i] = numbers[i] * 2;
            }

            return answer;
        }
    }

}
