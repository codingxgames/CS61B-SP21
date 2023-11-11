/** Class that prints the Collatz sequence starting from a given number.
 *  @author Janet Guo
 */
public class Collatz {

    /** if n is 1, then return 1;
     * if n is odd, then return 3n+1;
     * if n is even, then return n/2.*/
    public static int nextNumber(int n) {
        if (n == 1) {
            return 1;
        } else if (n % 2 == 1) {
            return 3 * n + 1;
        } else {
            return n / 2;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + " ");
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

