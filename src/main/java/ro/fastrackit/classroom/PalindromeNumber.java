package ro.fastrackit.classroom;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        int rem,rev = 0; //reminder & reverse=0
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt(); //check if the num is palindrome or not
        int temp = num;  // temp to not have any modifications in the original num

        while(temp != 0){
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if(rev == num){ //if true then is palindrome, if false then not palindrome
            System.out.println("Is a Palindrome Number");
        }
        else{
            System.out.println("Not a Palindrome Number");
        }

    }
}
