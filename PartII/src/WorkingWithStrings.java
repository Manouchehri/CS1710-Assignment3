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
        int test = numWords(userInput.nextLine());
        System.out.println(test);
        reverse(userInput.next());
        String holder = repeat(userInput.next(), userInput.nextInt());
        System.out.println(holder);
    }
    public static void reverse(String input) {
        System.out.println("Original word: " + input);

        String reversed = "";
        for(int i = input.length() - 1; i >= 0; i--)
            reversed += input.charAt(i);

        // Much easier way of doing it, but probably defeats the purpose of the assignment.
        // String reversed = new StringBuilder(input).reverse().toString();

        System.out.println("Original word: " + reversed);
    }
    public static String repeat(String str, int n) {
        String result = "";
        for(int i = 0; i < n; i++)
            result += str;
        return result;
    }
    public static int numWords(String input) {
        if (input.isEmpty())
            return 0;

        /* Doesn't handle multiple blank spaces, but the assignment didn't say if we need to deal with that or not. */
        String breakers[]=input.split(" ");
        return breakers.length;
    }
}
