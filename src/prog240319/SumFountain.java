package prog240319;

public class SumFountain {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] solution1 = solution.solution(1, 2, 3, 4);
        for (int i = 0; i < solution1.length; i++) {
            System.out.println(solution1[i]);
        }

    }

    static class Solution {
        public int[] solution(int numer1, int denom1, int numer2, int denom2) {

            int numer = numer1 * denom2 + numer2 * denom1;
            int denom = denom1 * denom2;

            int lcm = 1;
            for(int i = 1; i <= numer && i <= denom; i++) {
                if(denom % i == 0 && numer % i == 0) {
                    lcm = i;
                }
            }

            numer = numer / lcm;
            denom = denom / lcm;

            int[] answer = {numer, denom};
            return answer;
        }

    }
}
