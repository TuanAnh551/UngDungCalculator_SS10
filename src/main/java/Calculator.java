public class Calculator {
    public static double calculate(double numberOne, double numberTwo, String operator) throws ArithmeticException {
        double result = 0;
        switch (operator) {
            case "+":
                result = numberOne + numberTwo;
                break;
            case "-":
                result = numberOne - numberTwo;
                break;
            case "*":
                result = numberOne * numberTwo;
                break;
            case "/":
                if (numberTwo == 0) {
                    throw new ArithmeticException("Division by zero!");
                }
                result = numberOne / numberTwo;
                break;
        }
        return result;
    }
}
