import java.util.ArrayList;
import java.util.List;

public class OptimalDivision {

    public static void main(String[] args) {
        
        System.out.println(optimalDivision(120));
        
    }

    public static int optimalDivision(int N) {
        // To store the current value of N during the process
        int currentN = N;//120

        while (true) {
            List<Integer> validDivisors = findValidDivisors(currentN);
            if (validDivisors.isEmpty()) {
                return countDivisors(currentN);
            }

            // Divide by the best divisor
            currentN = currentN / validDivisors.get(0); // Assuming the first valid divisor is optimal
        }
    }

    // Method to find all valid divisors with exactly D divisors
    private static List<Integer> findValidDivisors(int number) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0 && countDivisors(i) == 4) { // Assuming D = 4 for the example
                divisors.add(i);
            }
        }
        // System.out.println(divisors);
        return divisors;
    }

    // Method to count the number of divisors of a number
    private static int countDivisors(int number) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                if (i * i == number) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }
}
