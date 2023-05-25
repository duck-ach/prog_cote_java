package prog230525;

public class EvenOddDiffValue {
    public int solution(int n) {
        int answer = 0;

        if(n % 2 == 0) {
            answer = 1;
            for(int i = 1; i < n; i++) {
                int ans = (int)Math.pow(i, n);
                answer += ans;
            }
        } else {
            for(int i = 0; i < n; i++) {
                answer += i;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        EvenOddDiffValue eo = new EvenOddDiffValue();
        int result = eo.solution(10);

        System.out.println("result = " + result);


    }
}
