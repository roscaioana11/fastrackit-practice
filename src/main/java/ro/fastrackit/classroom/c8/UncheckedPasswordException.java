package ro.fastrackit.classroom.c8;

/* At least 12characters
   Uppercase and lowercase
   Atleast 3 digits
   Only letters and digits

   If it is valid: the password is printed and the text “is valid”
   If it is invalid: a custom InvalidPasswordException is thrown with the text containing all rules which are not fulfilled
 */

import java.util.Scanner;

public class UncheckedPasswordException{
    public static void main(String[] args) {

        String pass;

        Scanner scann = new Scanner (System.in);

        System.out.print("Password: ");
        pass = scann.nextLine();

        System.out.println(validatePassCheck(pass));				// Calls the PassCheck Method on the password entered by the user and prints result to screen
    }

    static String validatePassCheck(String password){

        String result = "Valid Password";			// Sets the initial result as valid
        String result2= "Invalid Password";
        int length = 0;						// Stores the number characters in the password
        int numCount = 0;					// Variable used to store numbers in the password
        int upperCount = 0;					// Variable used to store capital letters in the password
        int lowCount = 0;                   // Variable used to store lower letters in the password


        for (int x =0; x < password.length(); x++) {
            if ((password.charAt(x) >= 47 && password.charAt(x) <= 58) || (password.charAt(x) >= 64 && password.charAt(x) <= 91) ||
                    (password.charAt(x) >= 97 && password.charAt(x) <= 122)) {
                //Keep the Password
            } else {
                result = "Password Contains Invalid Character!";		//Checks that password contains only letters and numbers
            }

            if ((password.charAt(x) > 47 && password.charAt(x) < 58)) {			// Counts the number of numbers
                numCount ++;
            }

            if ((password.charAt(x) > 64 && password.charAt(x) < 91)) {			// Counts the number of capital letters
                upperCount ++;
            }

            if ((password.charAt(x) > 97 && password.charAt(x) < 122)){
                lowCount ++;
            }

            length = (x + 1);								// Counts the passwords length

        }

        if (numCount < 3 || upperCount <1 || lowCount <1 || length <12){
            throw  new RuntimeException(result2 + " Your password needs atleast 12 characters, 3 numbers, 1 Uppercase and 1 Lowercase");
        }
/*
        if (numCount < 3){									// Checks that password contains atleast 3 numbers
            throw new RuntimeException(result2 + ". Need atleast 3 numbers.");
        }

        if (upperCount < 1) {									// Checks that the password contains atleast 1 uppercase letter
            throw new RuntimeException(result2 + ". Not Enough Capital Letters in the Password!");
        }

        if(lowCount < 1){                                   //Checks that password contains atleast 1 lowercase letter
            throw new RuntimeException(result2 + ". Not enough Lower Letters in the Password.");
        }

        if (length < 12){									// Checks that password is long enough
            throw new RuntimeException(result2 + ". Password is Too Short!");
        }
*/
        return (result);

    }
}
