/**
// while loop: initialize; while (condition) { statements; next;}
// for loop: for (initialize; condition; next) { statements;}
            int bottles = 99;
            while (bottles > 0) {
            System.out.println(bottles + "bottles of beer on the wall.");
            bottles = bottles - 1;
            }
*/

public class Loop {
    /**
    public static int whileSum(int[] a) {
        int i = 0; //initialization
        int sum = 0;
        while (i < a.length) { //termination
            sum = sum + a[i];
            i = i + 1; //increment
        }
        return sum;
    } */

    public static int loopSum(int[] a) {
        int sum = 0;
        // for (initialization; termination; increment) { statements; }
        for (int i = 0; i < a.length; i = i + 1) {
            sum = sum + a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {4, 3, 2, 1};
        System.out.println(loopSum(a));
    }
}

/**
for (int i = 0, j = 10; i < j; i += 1) {
    System.out.println(i + j);
        }
*/
