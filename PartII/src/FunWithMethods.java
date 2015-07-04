/**
 * @author David Manouchehri
 *         Created on 6/26/15 at 2:33 PM.
 *         All content is under the MIT License unless otherwise specified.
 *         See LICENSE.txt for details.
 */

import java.util.Arrays;
import java.util.Scanner;

public class FunWithMethods {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int userVar1 = userInput.nextInt();
        System.out.print("Enter second integer: ");
        int userVar2 = userInput.nextInt();
        System.out.print("Enter third integer: ");
        int userVar3 = userInput.nextInt();

        printSmallest(userVar1, userVar2, userVar3);

        System.out.println("The average is: " + average(userVar1, userVar2, userVar3));
    }
    public static void printSmallest(int var1, int var2, int var3) {
        int holder[] = {var1, var2, var3};
        Arrays.sort(holder);
        System.out.println(holder[0]);
    }
    public static double average(int var1, int var2, int var3) {
        return ((var1 + var2 + var3) / 3);
    }
}
