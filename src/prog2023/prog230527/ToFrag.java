package prog2023.prog230527;

public class ToFrag {

    public int solution(int a, int b, boolean flag) {
        int answer = 0;

        if(flag == true) {
            answer = a + b;
        } else {
            answer = a - b;
        }

        return answer;
    }

}
