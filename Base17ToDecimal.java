import java.util.Scanner;
public class Base17ToDecimal {
    public static int base17ToDecimal(String base17) {
        int length = base17.length();
        int decimalValue = 0;
        for (int i = 0; i < length; i++) {
            char digit = base17.charAt(length - 1 - i);
            int decimalDigit = 0;
            
            if (digit >= '0' && digit <= '9') {
                decimalDigit = digit - '0';
            } else if (digit >= 'A' && digit <= 'G') {
                decimalDigit = 10 + (digit - 'A');
            }
            decimalValue += decimalDigit * Math.pow(17, i);
        }
        return decimalValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a base-17 number:");
        String base17 = scanner.nextLine();
        int decimalValue = base17ToDecimal(base17);
        System.out.println("Decimal value: " + decimalValue);
        scanner.close();
    }
}

/*
Given a maximum of four digits to the base 17 (where digits from 10 to 16 are represented as follows: 10 -> A, 11 -> B, 12 -> C, 13 -> D, 14 -> E, 15 -> F, 16 -> G), write a Java program that converts the base-17 number to its decimal (base-10) equivalent.

Input:
A single string representing a base-17 number (maximum of four characters). Each character can be a digit (0-9) or a letter (A-G).

Output:
A single integer representing the decimal (base-10) value of the input base-17 number.

Example:
Input: 23GF
Output: 10980
For the input `23GF`:
- `F` (position 0) = 15
- `G` (position 1) = 16
- `3` (position 2) = 3
- `2` (position 3) = 2

Decimal value = 2*17^3 + 3*17^2 + 16*17^1 + 15*17^0
= 9826 + 867 + 272 + 15  
= 10980
 */
