/**
Program to find if the given numbers are Friendly Pair (Amicable) or not. Friendly Pair are two or more numbers with a common abundance.
Input & Output Format
	Input consists of 2 integers.
	The first integer corresponds to number 1 and the second integer corresponds to number 2.
	If it is a Friendly Pair, display Friendly Pair or else display not Friendly Pair.
Example:
6 and 28 are Friendly Pair.
("Sum of divisors of " 6)/6=("Sum of divisors of " 28)/28
**/

import java.util.Scanner;

public class FriendlyPair {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the two Numbers");

        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int sum1 = 0, sum2 = 0;

        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0) {
                sum1 += i;
            }
        }

        for (int i = 1; i <= n2; i++) {
            if (n2 % i == 0) {
                sum2 += i;
            }
        }

        if (sum1 % n1 == 0 && sum2 % n2 ==0){
            System.out.println("Friendly Pair");
        }
        else{
            System.out.println("Not Friendly Pair");
        }
    }
}
