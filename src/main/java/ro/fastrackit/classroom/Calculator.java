package ro.fastrackit.classroom;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Two Numbers");
        int x = scan.nextInt();
        int y = scan.nextInt();

        System.out.println("Choose the Operation");
        System.out.println("+ for Addition");
        System.out.println("- for Subtraction");
        System.out.println("* for Multiplication");
        System.out.println("/ for Division");

        char choose = scan.next().charAt(0);

        switch (choose){
            case '+': System.out.println("The answer is: " + add(x,y));
                break;
            case '-': System.out.println("The answer is: " + sub(x,y));
                break;
            case '*': System.out.println("The answer is: " + mult(x,y));
                break;
            case '/': System.out.println("The answer is: " + div(x,y));
                break;
            default: System.out.println("Error! Enter correct operator");
                return;
        }

    }
    public static int add(int x, int y){
        int n;
        n = x + y;
        return n;
    }
    public static int sub(int x, int y){
        int n;
        n = x - y;
        return n;
    }
    public static int mult(int x, int y){
        int n;
        n = x * y;
        return n;
    }
    public static int div(int x, int y){
        int n;
        n = x / y;
        return n;
    }
}
