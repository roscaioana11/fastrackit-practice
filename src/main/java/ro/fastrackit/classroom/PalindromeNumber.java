package ro.fastrackit.classroom;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        int rem,rev = 0;
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int temp = num;

        while(temp != 0){
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if(rev == num){
            System.out.println("Is a Palindrome Number");
        }
        else{
            System.out.println("Not a Palindrome Number");
        }

    }
}
