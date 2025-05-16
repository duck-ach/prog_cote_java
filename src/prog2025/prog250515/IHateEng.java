package prog2025.prog250515;

public class IHateEng {
    public static long solution(String numbers) {

        return Long.parseLong(numbers.replace("zero", "0").replace("one", "1").replace("two", "2").replace("three", "3").replace("four", "4").replace("five", "5").replace("six", "6").replace("seven", "7").replace("eight", "8").replace("nine", "9"));
    }

    public static void main(String[] args) {
        System.out.println(solution("onetwothreefourfivesixseveneightnine"));
    }
}
