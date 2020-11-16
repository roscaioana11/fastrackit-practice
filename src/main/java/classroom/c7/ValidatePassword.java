package classroom.c7;

/* At least 12characters
   Uppercase and lowercase
   At least 3 digits
   Only letters and digits
 */

import java.util.Scanner;

public class ValidatePassword {
    public static void main (String [] args) {

        String pass;

        Scanner scann = new Scanner (System.in);

        System.out.print("Password: ");
        pass = scann.next();

        System.out.println(passCheck(pass));				// Calls the PassCheck Method on the password entered by the user and prints result to screen

    }

    public static String passCheck (String password) {

        String result = "Valid Password ";			// Sets the initial result as valid
        int length = 0;						// Stores the number characters in the password
        int numCount = 0;					// Variable used to store numbers in the password
        int upperCount = 0;					// Variable used to store capital letters in the password
        int lowCount = 0;                   // Variable used to store lower letters in the password


        for (int x =0; x < password.length(); x++) {
            if ((password.charAt(x) >= 47 && password.charAt(x) <= 58) || (password.charAt(x) >= 64 && password.charAt(x) <= 91) ||
                    (password.charAt(x) >= 97 && password.charAt(x) <= 122)) {
                //Keep the Password
            } else {
                result = "Password Contains Invalid Character! ";		//Checks that password contains only letters and numbers
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

        if (numCount < 3){									// Checks that password contains at least 3 numbers
            result += "Need at least 3 numbers. ";
        }

        if (upperCount < 1) {									// Checks that the password contains at least 1 uppercase letter
            result += "Not Enough Capital Letters in the Password! ";
        }

        if(lowCount < 1){                                   //Checks that password contains at least 1 lowercase letter
            result += "Not enough Lower Letters in the Password. ";
        }

        if (length < 12){									// Checks that password is long enough
            result += "Password is Too Short! ";
        }

        return (result);

    }
}
