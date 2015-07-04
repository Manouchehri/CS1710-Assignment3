/**
 * @author David Manouchehri
 *         Created on 6/26/15 at 2:34 PM.
 *         All content is under the MIT License unless otherwise specified.
 *         See LICENSE.txt for details.
 */

import java.util.Scanner;

public class WorkingWithStrings {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        reverse(userInput.next());
    }
    public static void reverse(String input) {
        System.out.println("Original word: " + input);

        String reversed = "";
        for(int i = input.length() - 1; i >= 0; i--)
            reversed += input.charAt(i);

        System.out.println("Original word: " + reversed);
    }
}
