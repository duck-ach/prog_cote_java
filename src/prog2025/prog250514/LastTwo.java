package prog2025.prog250514;

import java.util.Arrays;

public class LastTwo {
    public static void main(String[] args) {
        solution(new int[]{2, 1, 6});
        solution(new int[]{5, 2, 1, 7, 5});
    }

    public static int[] solution(int[] num_list) {
        int[] answer = {};
        answer = Arrays.copyOf(num_list, num_list.length + 1);
        if(num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            answer[answer.length - 1] = num_list[num_list.length - 1] - num_list[num_list.length - 2];
        } else {
            answer[answer.length - 1] = num_list[num_list.length - 1] + num_list[num_list.length - 1];
        }
        return answer;
    }
}
