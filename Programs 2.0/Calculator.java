// Design a command-line calculator that can perform basic arithmetic operations (+, -, *, /) on two numbers. The program should be able to handle both integer and floating-point inputs. If a non-numeric argument is provided, it should gracefully inform the user. The program should use Wrapper Classes for internal number representation and demonstrate Autoboxing during calculations.

import java.util.Scanner;

class arithmetic{

    static void add(Number num1, Number num2){
        double sum = num1.doubleValue() + num2.doubleValue(); 
        System.out.println("Sum: " + sum);
    }

    static void subtract(Number num1, Number num2){
        double difference = num1.doubleValue() - num2.doubleValue();
        System.out.println("Difference: " + difference);
    }
    static void multiply(Number num1, Number num2){
        double product = num1.doubleValue() * num2.doubleValue();
        System.out.println("Product: " + product);
    }
    static void divide(Number num1, Number num2){
        if(num2.doubleValue() != 0){
            double quotient = num1.doubleValue() / num2.doubleValue();
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
public class Calculator {

    public static void main(String[] args){
        System.out.println("Welcome to Command-Line Calculator");
        int ch;

        System.out.println();
        System.out.println("Enter your Choice:");
        Scanner input= new Scanner(System.in);
        ch=input.nextInt();
        
        do{
            System.out.println("1. Add 2 numbers \n2. Subtract 2 numbers \n3. Multiply 2 numbers \n4. Divide 2 numbers");

            switch(ch){
                case 1 -> {
                        Number n1 = parseInput(args[0]);
                        Number n2 = parseInput(args[1]);

                        arithmetic.add(n1,n2);
                }

                case 2 -> {
                        Number n1 = parseInput(args[0]);
                        Number n2 = parseInput(args[1]);

                        arithmetic.subtract(n1,n2);
                }

                case 3 -> {
                        Number n1 = parseInput(args[0]);
                        Number n2 = parseInput(args[1]);

                        arithmetic.multiply(n1,n2);
                }

                case 4 -> {
                        Number n1 = parseInput(args[0]);
                        Number n2 = parseInput(args[1]);

                        arithmetic.divide(n1,n2);
                }
                default -> System.out.println("Invalid Choice");
            }
        } while(ch==5);

    }
        static Number parseInput(String input) {
        try {
            if (input.contains(".")) {
                return Float.parseFloat(input);
            } else {
                return Integer.parseInt(input);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: " + input + " is not a number.");
            return null;
        }
    }

}