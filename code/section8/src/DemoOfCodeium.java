public class DemoOfCodeium {


    public static void main(String[] args) {
        System.out.println("Hello Raj");
    }
/**
 * This method performs an arithmetic operation on two numbers.
 *
 * @param a The first number.
 * @param b The second number.
 * @param operation The arithmetic operation to perform. Accepts "+", "-", "*", "/".
 * @return The result of the arithmetic operation.
 * @throws IllegalArgumentException if an invalid operation is provided.
 */
public static double performArithmeticOperation(double a, double b, String operation) throws IllegalArgumentException {
    switch (operation) {
        case "+":
            return a + b;
        case "-":
            return a - b;
        case "*":
            return a * b;
        case "/":
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            return a / b;
        default:
            throw new IllegalArgumentException("Invalid operation: " + operation);
    }
}
}
