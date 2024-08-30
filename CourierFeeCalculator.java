import java.util.Scanner;

public class CourierFeeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Kilometer");
        int km = sc.nextInt();
        System.out.println("Enter the Kilogram");
        int kg = sc.nextInt();
        sc.close();
        int fee = 5;
        int fine1 = 0, fine2 = 0;
        if (km > 49) {
            if (km > 50) {
                fine1 += ((km - 50) / 50 + 1) * 10;
            } else {
                fine1 = 10;
            }
        }
        
        if (kg > 99) {
            if (kg > 100) {
                fine2 += ((kg - 100) / 100 + 1) * 10;
            } else {
                fine2 = 10;
            }
        }
        
        System.out.println(fee + fine1 + fine2);
    }
}
/*
Question: Courier Fee Calculation

You are tasked with designing a courier fee calculator for a delivery service. The service has the following pricing rules:

Base Fee: The minimum charge for any delivery is $5.

Distance Charges:

For deliveries up to 49 kilometers, there is no additional charge.
For distances between 50 kilometers and 99 kilometers, an additional charge of $10 is applied.
For distances exceeding 99 kilometers, an additional charge of $10 is applied for every additional 50 kilometers (or part thereof).
Weight Charges:

For weights up to 99 kilograms, there is no additional charge.
For weights between 100 kilograms and 199 kilograms, an additional charge of $10 is applied.
For weights exceeding 199 kilograms, an additional charge of $10 is applied for every additional 100 kilograms (or part thereof).
You need to implement a program that calculates the total fee for a delivery based on the distance and weight provided. The program should read the distance and weight from the user and then compute and print the total fee.

Input
Two integers kg and km representing the weight in kilograms and the distance in kilometers, respectively.
Output
An integer representing the total fee for the delivery.
Example
Input
Copy code
120 120
Output
Copy code
35
Explanation
Base fee: $5
Distance charge: For 120 kilometers, the additional charge is $10 (for the first 50 kilometers) + $10 (for the next 50 kilometers) = $20
Weight charge: For 120 kilograms, the additional charge is $10
Total fee: 5 (base fee) + 20 (distance charge) + 10 (weight charge) = 35
Constraints
1 ≤ kg ≤ 500
1 ≤ km ≤ 500
 */
