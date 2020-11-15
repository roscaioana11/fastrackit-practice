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
    int passwordConditionIllegal;

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
                System.out.println(caughtInvalidPasswordException.printMessage());
            }

        }

    }
    static List<PasswordBox> createPasswordList(){
        ArrayList<PasswordBox> passwordList = new ArrayList<>();
        PasswordBox tryPassword = new PasswordBox("Password length should be atleast 12 characters","Password should contain at least 3 digit","Password should contain at least 1 uppercase","Password should contain at least 1 lowecase");
        passwordList.add(tryPassword);
        System.out.println("You need: " + passwordList);
        return passwordList;
    }

    public InvalidPasswordException(int conditionIllegal)
    {
        super("Invalid Password");
        passwordConditionIllegal = conditionIllegal;
    }
    public String printMessage()
    {
        // Call constructor of parent Exception
        // according to the illegal condition
        switch (passwordConditionIllegal) {

            // Password length should be atleat 12 characters
            case 1:

            // Password should contain// at least 3 digits
            case 2:

            // Password should contain at least one uppercase letter (A-Z)
            case 3:

            // Password should contain at least one lowecase letter (a-z)
            case 4:
        }

        return ("" + createPasswordList());
    }




        // whether a password is valid or not
        public static void validatePassCheck(String password)
                throws InvalidPasswordException
        {

            // for checking if password length
            if (!((password.length() >11))) {
                throw new InvalidPasswordException(1);
            }

            if (true) {
                int count = 0;

                // check digits from 0 to 9
                for (int i = 0; i <= 9; i++) {

                    // to convert int to string
                    String str1 = Integer.toString(i);

                    if (password.contains(str1)) {
                        count = 3;
                    }
                }
                if (count == 0) {
                    throw new InvalidPasswordException(2);
                }
            }

            if (true) {
                int count = 0;

                // checking capital letters
                for (int i = 65; i <= 90; i++) {

                    // type casting
                    char c = (char)i;

                    String str1 = Character.toString(c);
                    if (password.contains(str1)) {
                        count = 1;
                    }
                }
                if (count == 0) {
                    throw new InvalidPasswordException(3);
                }
            }

            if (true) {
                int count = 0;

                // checking small letters
                for (int i = 90; i <= 122; i++) {

                    // type casting
                    char c = (char)i;
                    String str1 = Character.toString(c);

                    if (password.contains(str1)) {
                        count = 1;
                    }
                }
                if (count == 0) {
                    throw new InvalidPasswordException(4);
                }
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

