package classroom.c8;

import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {

        MyCalculator my_calculator = new MyCalculator();
        Scanner scann = new Scanner(System.in);
        System.out.println("Enter first number: ");

            while (scann.hasNextInt()) {
                int n = scann.nextInt();
                System.out.println("Enter second number: ");
                int p = scann.nextInt();

                try {
                    System.out.println(my_calculator.power(n, p));
                } catch (Exception e) {
                    System.out.println(e);
                }
            }

    }

    private long power(int n,int p) throws Exception {
        if(n < 0 || p < 0){
            throw new Exception ("n or p should not be negative.");
        }
        else if (n == 0 && p == 0){
            throw new Exception ("n and p should not be zero.");
        }
        else {
            return ((long)Math.pow(n,p));
        }
    }


}
