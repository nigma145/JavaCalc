public class Switch {
    public static void main(String[] args) {
        double n1 = 5;
        double n2 = 5;
        char operator = '*';

        double result = calculate(n1, n2, operator);

        System.out.println("Результат: " + result);
    }

    public static double calculate(double n1, double n2, char operator) {
        double result = 0;

        switch (operator) {
            case '+':
                result = n1 + n2;
                break;
            case '-':
                result = n1 - n2;
                break;
            case '*':
                result = n1 * n2;
                break;
            case '/':
                result = n1 / n2;
                break;
        }

        return result;
    }
}

