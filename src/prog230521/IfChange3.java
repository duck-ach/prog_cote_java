package prog230521;

public class IfChange3 {
    // 조건에 맞게 수열 변환하기
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            // 홀수라면?
            if(k % 2 == 1) {
                answer[i] = arr[i] * k;
            } else {
                answer[i] = arr[i] + k;
            }
        }

        return answer;

    }

}
