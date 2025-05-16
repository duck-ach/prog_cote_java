package prog2025.prog250513;

public class DivideBlank {

    public static String[] solution(String my_string) {
        String[] answer = my_string.split(" ");
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("I Love You"));
    }

}
