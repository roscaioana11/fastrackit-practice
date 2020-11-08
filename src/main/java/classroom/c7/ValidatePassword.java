package classroom.c7;

/* At least 12characters
   Uppercase and lowercase
   Atleast 3 digits
   Only letters and digits
 */

import java.util.Scanner;

public class ValidatePassword {
    public static void main (String [] args) {

        String pass;

        Scanner scann = new Scanner (System.in);

        System.out.print("Password: ");
        pass = scann.next();

        System.out.println(PassCheck(pass));				// Calls the PassCheck Method on the password entered by the user and prints result to screen

    }

    public static String PassCheck (String Password) {

        String result = "Valid Password";			// Sets the initial result as valid
        int length = 0;						// Stores the number characters in the password
        int numCount = 0;					// Variable used to store numbers in the password
        int upperCount = 0;					// Variable used to store capital letters in the password
        int lowCount = 0;                   // Variable used to store lower letters in the password


        for (int x =0; x < Password.length(); x++) {
            if ((Password.charAt(x) >= 47 && Password.charAt(x) <= 58) || (Password.charAt(x) >= 64 && Password.charAt(x) <= 91) ||
                    (Password.charAt(x) >= 97 && Password.charAt(x) <= 122)) {
                //Keep the Password
            } else {
                result = "Password Contains Invalid Character!";		//Checks that password contains only letters and numbers
            }

            if ((Password.charAt(x) > 47 && Password.charAt(x) < 58)) {			// Counts the number of numbers
                numCount ++;
            }

            if ((Password.charAt(x) > 64 && Password.charAt(x) < 91)) {			// Counts the number of capital letters
                upperCount ++;
            }

            if ((Password.charAt(x) > 97 && Password.charAt(x) < 122)){
                lowCount ++;
            }

            length = (x + 1);								// Counts the passwords length

        }

        if (numCount < 3){									// Checks that password contains atleast 3 numbers
            result = "Need atleast 3 numbers";
        }

        if (upperCount < 1) {									// Checks that the password contains atleast 1 uppercase letter
            result = "Not Enough Capital Letters in the Password!";
        }

        if(lowCount < 1){                                   //Checks that password contains atleast 1 lowercase letter
            result = "Not enough Lower Letters in the Password";
        }

        if (length < 12){									// Checks that password is long enough
            result = "Password is Too Short!";
        }

        return (result);

    }
}
