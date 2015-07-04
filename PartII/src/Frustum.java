/**
 * @author David Manouchehri
 *         Created on 6/26/15 at 2:38 PM.
 *         All content is under the MIT License unless otherwise specified.
 *         See LICENSE.txt for details.
 *
 *         Page 245, P5.34
 */

import java.util.Scanner;

public class Frustum {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter R1: ");
        int userR1 = userInput.nextInt();
        System.out.print("Enter R2: ");
        int userR2 = userInput.nextInt();
        System.out.print("Enter h: ");
        int h = userInput.nextInt();

        System.out.println("The volume is: " + getVolume(userR1, userR2, h));
        System.out.println("The surface is: " + getSurface(userR1, userR2, h));
    }
    public static double getVolume(int R1, int R2, int h) {
        return (1/3)*Math.PI*h*(Math.pow(R1, 2) + Math.pow(R2, 2) + R1*R2);
    }
    public static double getSurface(int R1, int R2, int h) {
        return Math.PI*(R1 + R2)*Math.sqrt(Math.pow(R2 - R1, 2) + Math.pow(h, 2)) + Math.PI*Math.pow(R1, 2);
    }
}
