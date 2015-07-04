/**
 * @author David Manouchehri
 *         Created on 6/26/15 at 2:35 PM.
 *         All content is under the MIT License unless otherwise specified.
 *         See LICENSE.txt for details.
 *
 *         Page 244, P5.30
 */

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String pass, passTest;
        do {
            pass = ""; // Reset it just in case.
            while (!isValid(pass)) {
                System.out.println("Please enter a new password.");
                pass = userInput.next();
            }
            System.out.println("Enter the password again.");
            passTest = userInput.next();
        }
        while(!pass.equals(passTest));
    }
    public static boolean isValid(String pass) {
        return length(pass) && myCase(pass) && digit(pass);
    }
    public static boolean length(String pass) {
        return pass.length() >= 8;
    }
    public static boolean myCase(String pass) {
        boolean upper = false, lower = false;
        for(int i = 0; i < pass.length(); i++) {
            if(Character.isUpperCase(pass.charAt(i)))
                upper = true;
            else if(Character.isLowerCase(pass.charAt(i)))
                lower = true;

            if(upper && lower) // No need to waste cycles
                return true;
        }
        return false;
    }
    public static boolean digit(String pass) {
        for(int i = 0; i < pass.length(); i++)
            if(Character.isDigit(pass.charAt(i)))
                return true;

        return false;
    }
}
