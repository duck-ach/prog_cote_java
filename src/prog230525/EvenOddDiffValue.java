package prog230525;

public class EvenOddDiffValue {
    public int solution(int n) {

        int answer = 0;

        for(int i = n; i >= 0; i -= 2)
            answer += (n % 2 == 0) ? i * i : i;

        return answer;
    }

    public static void main(String[] args) {
        EvenOddDiffValue eo = new EvenOddDiffValue();
        int result = eo.solution(10);

        System.out.println("result = " + result);


    }
}
