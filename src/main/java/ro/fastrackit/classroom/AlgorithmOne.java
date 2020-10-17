package ro.fastrackit.classroom;

import java.util.Scanner;

public class AlgorithmOne {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a natural number");
        int n=scan.nextInt();
        int m=1;

        for(int i = 1; i<=n; i++){
            m *= i;
            System.out.println(m);
        }
    }
}
