import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        double answer;

        while(true) {
            int a = getInputValue(in, "Enter value a: ");
            int b = getInputValue(in, "Enter value b: ");

            System.out.println("Enter an option ( * / + - ): ");
            s = in.nextLine();

            answer = 0.0;

            switch (s) {
                case "*":
                    answer = a * b;
                    break;
                case "/":
                    if (b == 0) {
                        System.out.println("Value cannot be divided by zero");
                        System.exit(0);
                    } else {
                        answer = (double) a / b;
                    }
                    break;
                case "+":
                    answer = a + b;
                    break;
                case "-":
                    answer = a - b;
                    break;
                default:
                    System.out.println("Wrong command");
                    System.exit(0);
                    break;
            }
            DecimalFormat decimalFormat = new DecimalFormat("#.###");
            System.out.printf("Answer is: %s", decimalFormat.format(answer));
            System.out.println();
        }
    }

    private static int getInputValue(Scanner scanner, String prompt) {
        int value;
        while (true) {
            try {
                System.out.print(prompt);
                value = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid value, try again");
            }
        }
        return value;
    }
}