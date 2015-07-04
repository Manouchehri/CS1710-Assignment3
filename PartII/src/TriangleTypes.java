/**
 * @author David Manouchehri
 *         Created on 6/26/15 at 2:35 PM.
 *         All content is under the MIT License unless otherwise specified.
 *         See LICENSE.txt for details.
 */

import java.util.Scanner;

public class TriangleTypes {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter six integer values.");
        int[] points = new int[6];
        // I should probably loop this.
        points[0] = userInput.nextInt();
        points[1] = userInput.nextInt();
        points[2] = userInput.nextInt();
        points[3] = userInput.nextInt();
        points[4] = userInput.nextInt();
        points[5] = userInput.nextInt();

        printTType(computeDistance(points[0], points[1], points[2], points[3]),
                   computeDistance(points[2], points[3], points[4], points[5]),
                   computeDistance(points[4], points[5], points[0], points[1]));
    }
    public static double computeDistance(int x1, int y1, int x2, int y2) {
        double dis = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return dis;
    }
    public static void printTType(double l1, double l2, double l3) {
        if(l1 == l2 && l1 == l3)
            System.out.println("Equilateral.");
        else if((l1 == l2 && l2 != l3) || (l1 == l3 && l1 != l2))
            System.out.println("Isosceles.");
        else
            System.out.println("Scalene.");
    }
}
