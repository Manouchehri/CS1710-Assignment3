/**
 * @author David Manouchehri
 *         Created on 6/26/15 at 2:34 PM.
 *         All content is under the MIT License unless otherwise specified.
 *         See LICENSE.txt for details.
 */

import java.util.Arrays;
import java.util.Scanner;

public class WorkingWithStrings {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter string to reverse: ");
        reverse(userInput.next());

        System.out.print("Enter string to repeat: ");
        String repeater = userInput.next();

        System.out.print("Enter the number of times to repeat: ");
        int repeaterNum = userInput.nextInt();

        System.out.println(repeat(repeater, repeaterNum) + "");

        userInput.nextLine(); // Without this, the input gets screwed up and takes what was printed by mistake.
        System.out.print("Enter a line of words to count: ");
        String input = userInput.nextLine();
        System.out.println("The original string was: " + input); // The assignment asked me to echo it back. Dunno why.
        System.out.println(numWords(input) + " number of words.");

        System.out.print("Enter the first word to sort: ");
        String word_1 = userInput.next();
        System.out.print("Enter the second word to sort: ");
        String word_2 = userInput.next();
        printInOrder(word_1, word_2);

        System.out.print("Enter a word to replace vowels: ");
        System.out.println(replace(userInput.next()));
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
    public static void printInOrder(String str1, String str2) {
        String[] inputList = {str1, str2};
        Arrays.sort(inputList);
        /*for(int i = 0; i < inputList.length; i++)
            System.out.println(inputList[i]);*/
        System.out.println(inputList[0] + " and " + inputList[1]); // The assignment wants the word "and" in there, so I added it.
    }
    public static String replace(String input) {
        String holder = "";
        for(int i = 0; i < input.length(); i++)
            if(input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i'
                    || input.charAt(i) == 'o' || input.charAt(i) == 'u')
                holder += 'z';
            else
                holder += input.charAt(i);
        return holder;
    }
}
