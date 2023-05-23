package prog230523;

public class PrintArr {
    public String solution(String[] arr) {
        String answer = "";
        for(int i = 0; i<arr.length; i++) {
            answer += arr[i];
        }
        return answer;
    }
}
