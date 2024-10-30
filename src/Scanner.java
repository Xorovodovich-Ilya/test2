public class Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(Sistem.in)
        System.out.println("Введите первое число");
        int operand1 = scanner.nextxIn();
        System.out.println("Введите операцию +, -, *, /): ");
        char operation = scanner.next()charAt(0);
        System.out.println("Введите второе число");
        int operand2 = scanner.nextxIn();
        System.out.println("Ответ" + result);

        public static int calculate ( int operand1, char operation, int operand2){
            int recult =0;
            switch (operation) {
                case '+':
                    recult = operand1 + operand2;
                    break;
                case '-':
                    result = operand1 - operand2;
                    break;
                case '*':
                        recult = operand1 * operand2;
                        break;
                case '/':
                    recult = operand1 / operand2;
                    break;
                default:
                    System.out.println("Invalid operation");
                    break;
                    return result;
            }
        }
    }

}
