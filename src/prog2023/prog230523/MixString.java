package prog2023.prog230523;

public class MixString {

    public String solution(String str1, String str2) {

        String answer = "";

        for(int i = 0; i < str1.length(); i++) {
            answer += str1.substring(i, i+1);
            answer += str2.substring(i, i+1);
        }

        return answer;
    }

}
