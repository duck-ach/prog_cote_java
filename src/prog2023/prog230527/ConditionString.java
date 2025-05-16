package prog2023.prog230527;

public class ConditionString {
    public int solution(String ineq, String eq, int n, int m) {
        if(60 == ineq.charAt(0)){
            if(63 != eq.charAt(0))
                return n <= m ? 1 : 0;
            else
                return n < m ? 0 : 1;
        } else {
            if(63 != eq.charAt(0))
                return n >= m ? 1 : 0;
            else
                return n > m ? 0 : 1;
        }
    }

    public static void main(String[] args) {
        ConditionString cs = new ConditionString();
        cs.solution(">", "!", 41, 78);
        System.out.println("cs = " + cs);
    }

}
