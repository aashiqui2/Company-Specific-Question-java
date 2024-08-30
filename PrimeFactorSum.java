import java.util.Scanner;

public class PrimeFactorSum {

    // Method to compute the sum of numbers at prime factor indices
    public static int primeFactorSum(int[] arr, int num) {
        int sum = 0;
        boolean validIndexFound = false;
        
        // Get prime factors and their counts
        for (int i = 2; i <= num; i++) {
            int count = 0;
            while (num % i == 0) {
                num /= i;
                count++;
            }
            if (count > 0 && i < arr.length) {
                sum += count * arr[i];
                validIndexFound = true;
            }
        }
        
        return validIndexFound ? sum : 0;
    }

    public static void main(String[] args) {
        
       int arr[]={11,21,32,35,1,23};
       int n=arr.length;
        if (n == 0) {
            System.out.println(-1);
            return;
        }
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();

        int result = primeFactorSum(arr, num);
        System.out.println(result);
        
        sc.close();
    }
}
/*
Given an array arr of size n and a positive integer num, calculate the sum of numbers in the array at indices corresponding to the prime factors of num, multiplied by their multiplicities.

Note:

Prime factors of a positive integer are the prime numbers that divide that integer exactly.
If the array is empty, print -1.
If no prime factor corresponds to a valid index in the array, print 0.
Indices are 0-based, meaning the first element of the array is at index 0.
Input Format:
The first line contains an integer n, the size of the array.
The second line contains n space-separated integers, the elements of the array arr.
The third line contains a single integer num.
Output Format:
Print the sum as described above.

Example:
Input:

Copy code
6
11 21 32 45 1 23
6
Output:

Copy code
77
Explanation:

Prime factorization of 6 is 2^1 * 3^1.
Sum calculation:
1 * arr[2] = 1 * 32 = 32
1 * arr[3] = 1 * 45 = 45
Total sum = 32 + 45 = 77
Constraints:
The input number n will be a positive integer (0 <= n <= 10^5).
The array elements and num will be positive integers.
 */
