package prog2025.prog250511;

public class AmassPackageBox {
    public static void main(String[] args) {
        int n = 22;
        int w = 6;
        int num = 8;
        solution(n, w, num);
    }
    public static int solution(int n, int w, int num) {
        int targetLine = num / w;
        int endLine = n / w;
        System.out.println("targetLine = " + targetLine);
        System.out.println("endLine = " + endLine);
        // left -> right
        if(endLine > targetLine) {
            if(w % 2 == 0) {
                
            } else { // right -> left

            }
        }


        return targetLine;
    }
}
