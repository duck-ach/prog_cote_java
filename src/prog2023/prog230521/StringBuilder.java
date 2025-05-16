package prog2023.prog230521;

import java.util.Scanner;
// 문자열 개수에 맞게 출력하기
public class StringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        String result = "";
        for(int a = 0; a < n; a++) {
            result += str;
        }

        System.out.println(result);
        

    }

}
