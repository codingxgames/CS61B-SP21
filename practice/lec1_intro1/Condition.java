/** doubles and strings
String a = "Achilles";
String t = "Tortoise";
double aPos = 0;
double tPos = 100;
double aSpeed = 20;
double tSpeed = 10;
double totalTime = 0;
while (aPos < tPos) {
    System.out.println("At time: " + totalTime);
    System.out.println("  " + a + " is at position " + aPos);
    System.out.println("  " + t + " is at position " + tPos);

    double timeToReach = (tPos - aPos) / aSpeed;
    totalTime = totalTime + timeToReach;
    aPos = aPos + timeToReach * aSpeed;
    tPos = tPos + timeToReach * tSpeed;
}
*/

/**
 * // if condition
 * if (boolValue) {
 *     statements;
 *         }
 * // basic conditionals
 *         int x1 = 5;
 *         if (x1 < 10)
 *             x = x + 10;
 *         if (x1 < 10)
 *             x1 = x1 + 10;
 *         System.out.println(x1);
 * // Curly Braces and conditionals
 *         int x2 = 5;
 *         if (x2 < 10) {
 *             System.out.println("I shall increment x by 10.");
 *             x2 = x2 + 10;
 *         }
 *         if (x2 < 10) {
 *             System.out.println("I shall increment x by 10.");
 *             x2 = x2 + 10;
 *         }
 *         System.out.println(x);
 * // curly brace standards
 *         if (x > 5) {
 *             x = x + 5;
 *         }
 *         if (x > 5) {
 *             x = x + 5;
 *         }
 * // else
 *             int x3 = 9;
 *             if (x3 - 3 > 8) {
 *                 System.out.println("x3 - 3 is greater than 8");
 *             } else {
 *                 System.out.println("x3 - 3 is not greater than 8");
 *             }
 *             int dogSize = 20;
 *             if (dogSize >= 50) {
 *                 System.out.println("woof!");
 *             } else if (dogSize >= 10) {
 *                 System.out.println("bark!");
 *             } else {
 *                 System.out.println("yip!");
 *             }
 */
public class Condition {
    public static int max(int x, int y) {
        if (x > y) {
            return x;
        }
        return y;
    }
    public static void main(String[] args) {
        System.out.println(max(10, 15));
    }
}
