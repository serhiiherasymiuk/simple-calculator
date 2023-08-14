import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value a: ");
        int a;
        a = Integer.parseInt(in.nextLine());
        System.out.println("Enter value b: ");
        int b;
        b = Integer.parseInt(in.nextLine());
        System.out.println("Enter an option (* / + -): ");
        String s;
        s = in.nextLine();
        int answer = 0;
        switch (s) {
            case ("*"):
                answer = a * b;
                break;
            case ("/"):
                if (b == 0) {
                    System.out.println("Value cannot be divided by zero");
                    System.exit(0);
                }
                else
                    answer = a / b;
                break;
            case ("+"):
                answer = a + b;
                break;
            case ("-"):
                answer = a - b;
                break;
            default:
                System.out.println("Error");
                break;
        }
        System.out.printf("Answer is: %d", answer);

    }
}