package prog2025.prog250516;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MakeOne {
    public static int solution(int[] num_list) {
        int answer = 0;
        for(int i = 0; i < num_list.length; i++) {
            int num = num_list[i];
            if(num % 2 == 0) {
                while(num > 1) {
                    num /= 2;
                    answer++;
                }
            } else {
                num -=1;
                while(num > 1) {
                    num /= 2;
                    answer++;
                }
            }
        }
        return answer;
    }

    public static int solution2(int[] num_list) {
        return Arrays.stream(num_list).map(i -> Integer.toBinaryString(i).length() - 1).sum();
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {12,4,15,1,14}));
        System.out.println(solution2(new int[] {12,4,15,1,14}));
    }

}
