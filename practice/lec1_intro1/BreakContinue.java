public class BreakContinue {
    public static void windowPosSum(int[] a, int n) {
        for (int i = 0; i < (a.length - 1); i++) {
            if (a[i] < 0) {
                continue; // skip negative value
            }
            for (int j = 1; j <= n; j++) {
                if ((i + j) >= a.length) {
                    break; // avoid going over the end of the array
                }
                a[i] += a[i + j];

            }

        }
    }

    public static void main(String[] args) {
        // should print 4, 8, -3, 13, 9, 4
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);
        System.out.println(java.util.Arrays.toString(a));
    }
}
