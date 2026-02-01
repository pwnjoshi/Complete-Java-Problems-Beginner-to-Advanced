// Design a command-line calculator that can perform basic arithmetic operations (+, -, *, /) on two numbers. The program should be able to handle both integer and floating-point inputs. If a non-numeric argument is provided, it should gracefully inform the user. The program should use Wrapper Classes for internal number representation and demonstrate Autoboxing during calculations.

class arithmetic {

    static void add(Double num1, Double num2) {
        double sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }

    static void subtract(Double num1, Double num2) {
        double difference = num1 - num2;
        System.out.println("Difference: " + difference);
    }

    static void multiply(Double num1, Double num2) {
        double product = num1 * num2;
        System.out.println("Product: " + product);
    }

    static void divide(Double num1, Double num2) {
        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}

public class Calculator {

    public static void main(String[] args) {
        
        if (args.length < 3) {
            System.out.println("Invalid Arguments");
            return;
        }
        try {
            Double n1 = Double.parseDouble(args[0]); // Autoboxing
            Double n2 = Double.parseDouble(args[2]); // Autoboxing
            String operator = args[1].trim();

            switch (operator) {
                case "+" -> arithmetic.add(n1, n2);
                case "-" -> arithmetic.subtract(n1, n2);
                case "x" -> arithmetic.multiply(n1, n2);
                case "/" -> arithmetic.divide(n1, n2);
                default -> System.out.println("Invalid operator. Please use +, -, x, or /.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input.");
        }
    }

}