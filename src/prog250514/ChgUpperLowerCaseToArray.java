package prog250514;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChgUpperLowerCaseToArray {
    public static String[] solution(String[] strArr) {
        for(int i = 0; i < strArr.length; i++) {
            if(i % 2 == 0) {
                strArr[i] = strArr[i].toLowerCase();
            } else {
                strArr[i] = strArr[i].toUpperCase();
            }
        }
        return strArr;
    }

    public static void main(String[] args) {
        solution(new String[]{"ABC", "DEF"});
    }
}
