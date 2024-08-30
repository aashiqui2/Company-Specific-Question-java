/*Angela has decided to throw a pizza party. she has ordered N number of pizzas to be served to her N number of friends. In this way, she will be serving only one pizza to each friend. She now wants to invite fewer people to her party in order to provide more pizzas per person. But at the same time, she wants to ensure that there are at least Y friends at her party. Your task is to help Angela find and return an integer value, representing the sum of digits of the minimum number of friends that she can invite to the party, ensuring that each person gets an equal number of pizzas

Sample Input: 100 17 
Sample Output: 2

Explanation: N=100, Y=17 For Y=20 each friend gets 5 pizzas. So sum of digits of 20 is 2. */

public class PizzaParty {
    public static void main(String[] args) {
        int N = 100;
        int Y = 17;

        int result = findMinFriends(N, Y);
        System.out.println(result);
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static int findMinFriends(int N, int Y) {
        for (int i= Y; i <= N; i++) {
            if (N % i == 0) {
                return sumOfDigits(i);
            }
        }
        return -1; 
    }

}
