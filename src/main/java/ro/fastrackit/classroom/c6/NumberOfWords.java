package ro.fastrackit.classroom.c6;

import java.util.Scanner;

public class NumberOfWords {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = scan.nextLine();
        int count = countNumberOfWords(str);  //the declaration of the method below
        System.out.println("Number of words in the string: " + count);

    }

    private static int countNumberOfWords(String str) {  //method
        int count = 0; //initializing counting from 0

        if (str.charAt(0) != ' ') {
            count++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                count++;
            }
        }
        return count;
    }
}
