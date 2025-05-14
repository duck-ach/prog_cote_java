package prog250514;

public class ChgLowerCase {
    public static String solution(String myString) {
        String answer = "";
        answer = myString.toLowerCase();
        return answer;
    }

    public static void main(String[] args) {
        String myString = "Hello";
        solution(myString);
        System.out.println("solution(myString) = " + solution(myString));
    }
}
