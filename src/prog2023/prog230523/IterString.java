package prog2023.prog230523;

public class IterString {
    public String solution(String my_string, int k) {
        String answer = "";

        for(int i = 0; i < k; i++) {
            answer += my_string;
        }

        return answer;
    }
}
