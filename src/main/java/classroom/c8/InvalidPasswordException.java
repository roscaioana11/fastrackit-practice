package classroom.c8;

/* At least 12characters
   Uppercase and lowercase
   Atleast 3 digits
   Only letters and digits

   If it is valid: the password is printed and the text “is valid”
   If it is invalid: a custom InvalidPasswordException is thrown with the text containing all rules which are not fulfilled
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InvalidPasswordException extends Exception{
    List<String> passwordConditionIllegal;

    public static void main(String[] args) {

        Scanner scann = new Scanner (System.in);
        System.out.print("Password: ");

        while(scann.hasNext()) {

            String pass = scann.nextLine();

            try{
                validatePassCheck(pass);
                System.out.println("Valid Password");
            }catch (InvalidPasswordException caughtInvalidPasswordException){
                System.err.println(caughtInvalidPasswordException.getMessage());
                System.err.println(caughtInvalidPasswordException.printMessage());
            }

        }

    }

    public InvalidPasswordException(List<String> passwordErrorList)
    {
        super("Invalid Password");
        passwordConditionIllegal = passwordErrorList;
        String finalErrorString = "";
        for (int i = 0; i < passwordErrorList.size(); i++) {
            finalErrorString = finalErrorString + passwordErrorList.get(i);
        }

    }
    public String printMessage()
    {
        String errorList = "";
        for(int i = 0; i < passwordConditionIllegal.size(); i++){
            errorList = errorList + passwordConditionIllegal.get(i);
        }
        return(errorList);
    }

        // whether a password is valid or not
        public static void validatePassCheck(String password)
                throws InvalidPasswordException
        {
            List<String> passwordErrorList = new ArrayList<String>(); //create error list

            // for checking if password length
            if (!((password.length() >11))) {
                String passwordLenght = "Password length should be at least 12 characters. ";
                passwordErrorList.add(passwordLenght); //adding the error in the list
            }

                int countDigits = 0;

                // check digits
                for (int i = 0; i <= 9; i++) {

                    // to convert int to string
                    String str1 = Integer.toString(i);

                    if (password.contains(str1)) {
                        countDigits = 3;
                    }
                }
                if (countDigits == 0) {
                    String digits = "Password should contain at least 3 digit. ";
                    passwordErrorList.add(digits);
                }


                int countUpperCase = 0;

                // checking capital letters
                for (int i = 65; i <= 90; i++) {

                    // type casting
                    char c = (char)i;

                    String str1 = Character.toString(c);
                    if (password.contains(str1)) {
                        countUpperCase = 1;
                    }
                }
                if (countUpperCase == 0) {
                    String upperCase = "Password should contain at least 1 uppercase. ";
                    passwordErrorList.add(upperCase);
                }


                int countLowerCase = 0;

                // checking small letters
                for (int i = 90; i <= 122; i++) {

                    // type casting
                    char c = (char)i;
                    String str1 = Character.toString(c);

                    if (password.contains(str1)) {
                        countLowerCase = 1;
                    }
                }
                if (countLowerCase == 0) {
                    String lowerCase = "Password should contain at least 1 lowercase. ";
                    passwordErrorList.add(lowerCase);
                }


            if(!passwordErrorList.isEmpty() && passwordErrorList != null){ //verify if the list is empty or not
            throw new InvalidPasswordException(passwordErrorList); //throw the error list
                }
            // The password is valid
        }



/*
    static void validatePassCheck(String password) throws InvalidPasswordException {



        int length = 0;                        // Stores the number characters in the password
        int numCount = 0;                    // Variable used to store numbers in the password
        int upperCount = 0;                    // Variable used to store capital letters in the password
        int lowCount = 0;                   // Variable used to store lower letters in the password

        for (int x = 0; x < password.length(); x++) {
            if ((password.charAt(x) >= 47 && password.charAt(x) <= 58) || (password.charAt(x) >= 64 && password.charAt(x) <= 91) ||
                    (password.charAt(x) >= 97 && password.charAt(x) <= 122)) {
                //Keep the Password

                if (password.length() < 12) {                                    // Checks that password is long enough
                    throw new InvalidPasswordException("Password is Too Short!");
                }

                for (char passwordDigit : password.toCharArray()) {

                    if (Character.isDigit(passwordDigit)) {                                    // Checks that password contains atleast 3 numbers
                        throw new InvalidPasswordException("Need atleast 3 numbers" + passwordDigit);
                    }



            if ((password.charAt(x) >= 47 && password.charAt(x) <= 58) || (password.charAt(x) >= 64 && password.charAt(x) <= 91) ||
                    (password.charAt(x) >= 97 && password.charAt(x) <= 122)) {
                //Keep the Password
            } else if (password == null || password.isBlank() || password.equals("0")){
                throw new InvalidPasswordException("Password is missing");		//Checks that password contains only letters and numbers
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


                return;

            }
        }
    }

*/
    }

