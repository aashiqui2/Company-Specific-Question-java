public class AddSubCalculator {
    public static int addSub(int n, int opt) {
        int result = 0;
        if (opt == 1) {

            for (int i = n; i >= 1; i--) {
                if (i % 2 == 0) {
                    result -= i;
                } else {
                    result += i;
                }
            }
            result = Math.abs(result);
        } else if (opt == 2) {
            if (n % 2 == 0) {
                for (int i = 1; i <= n; i++) {
                    if (i % 2 == 0) {
                        result -= i;
                    } else {
                        result += i;
                    }
                }
                result = n - result;
            } else {
                for (int i = 1; i < n; i++) {
                    if (i % 2 == 0) {
                        result += i;
                    } else {
                        result -= i;
                    }
                }
                result = n + result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int N = 6;
        int opt1 = 1;
        int opt2 = 2;

        System.out.println("Result when N = " + N + " and opt = 1: " + addSub(N, opt1));
        System.out.println("Result when N = " + N + " and opt = 2: " + addSub(N, opt2));
    }
}

/*
 ** Problem Statement:**
 * 
 * Write a function `int AddSub(int N, int opt)` that calculates a result based
 * on the following rules:
 * 
 * 1. **Inputs:**
 * - An integer `N` (1 ≤ N ≤ 10,000).
 * - An integer `opt` which can be either `1` or `2`.
 * 
 * 2. **Outputs:**
 * - If `opt = 1`, calculate the result as:
 * `Result = N - (N-1) + (N-2) - (N-3) + (N-4) - ... + 1`
 * - If `opt = 2`, calculate the result as:
 * `Result = N + (N-1) - (N-2) + (N-3) - (N-4) + ... + 1`
 ** 
 * Examples:**
 * 
 * - Example 1:
 * - Input: `N = 6`, `opt = 1`
 * - Output: `Result = 6 - 5 + 4 - 3 + 2 - 1 = 3`
 * 
 * - Example 2:
 * - Input: `N = 6`, `opt = 2`
 * - Output: `Result = 6 + 5 - 4 + 3 - 2 + 1 = 9`
 ** 
 * Function Signature:**
 * 
 * ```java
 * public int AddSub(int N, int opt);
 * ```
 ** 
 * Constraints:**
 * 
 * - 1 ≤ `N` ≤ 10,000
 * - `opt` is either 1 or 2.
 */
