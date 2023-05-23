package prog230523;

public class CompareTwoNum {
    public int solution(int a, int b) {
        int answer = Integer.parseInt(a + "" + (b + ""));
        int answer2 = 2 * a * b;

        if(answer > answer2) {
            return answer;
        } else if(answer2 > answer) {
            return answer2;
        } else {
            return answer;
        }
    }
}
