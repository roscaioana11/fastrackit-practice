package ro.fastrackit.classroom.c8;

import java.util.Arrays;
import java.util.Scanner;

public class InvalidAnagramException extends Exception {
    public InvalidAnagramException(String message){
        super(message);
    }

    static boolean isAnagram(String a,String b) throws InvalidAnagramException {

        //checking the length
        if(a.length() != b.length()){
            //return false;
            String message = "";
            throw new InvalidAnagramException(message);
        }

        char string1ToArray[] = a.toCharArray();
        char string2ToArray[] = b.toCharArray();

        //sorting
        Arrays.sort(string1ToArray);
        Arrays.sort(string2ToArray);

        //iterate through the arrays
        for(int i = 0; i < a.length(); i++){
            if(string1ToArray[i] != string2ToArray[i]){
                //return false; //false if are not equal
                throw new InvalidAnagramException("Not Anagrams");
            }
        }
        return true; //true if are equal
    }

    public static void main(String[] args) throws InvalidAnagramException {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first String: ");
        String a = scan.next();
        System.out.println("Enter second String: ");
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
