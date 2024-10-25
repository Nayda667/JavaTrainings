import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String c = scan.nextLine();
// ctrl alt l, ctrl alt o
        if ("+".equals(c)) {
            int result = calculator.add();
            System.out.println("Result " + result);
        } else if ("-".equals(c)) {
            int result = calculator.minus();
            System.out.println("Result " + result);
        } else if ("*".equals(c)) {
            int result = calculator.multiply();
            System.out.println("Result " + result);
        } else if ("/".equals(c)) {
            float result = calculator.divide();
            System.out.println("Result " + result);
        } else {
            System.out.println("Error");
        }
    }
}