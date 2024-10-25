import java.util.Scanner;

public class Calculator {
    Scanner scan = new Scanner(System.in);

    public Calculator() {
        System.out.println("calculator on");
    }


    public int add() {
        int a = scan.nextInt();
        int b = scan.nextInt();
        return a + b;
    }

    public int minus() {
        int a = scan.nextInt();
        int b = scan.nextInt();
        return a - b;
    }

    public int multiply() {
        int a = scan.nextInt();
        int b = scan.nextInt();
        return a * b;
    }

    public float divide() {
        float a = scan.nextInt();
        float b = scan.nextInt();
        return a / b;
    }
}