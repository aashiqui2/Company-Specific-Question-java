public class AddSubCalculator {
    public static int AddSub(int N, int opt) {
        int result = 0;
        if (opt == 1) {
            for (int i = 1; i <= N; i++) {
                if (i % 2 == 0) {
                    result -= i;
                } else {
                    result += i;
                }
            }
        } else if (opt == 2) {
            for (int i = 1; i <= N; i++) {
                if (i % 2 == 0) {
                    result -= i;
                } else {
                    result += i;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int N = 6;
        int opt1 = 1;
        int opt2 = 2;
        
        System.out.println("Result when N = " + N + " and opt = 1: " + AddSub(N, opt1));
        System.out.println("Result when N = " + N + " and opt = 2: " + AddSub(N, opt2));
    }
}
