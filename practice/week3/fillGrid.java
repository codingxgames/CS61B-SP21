package week3;

public class fillGrid {
    public static void fillGrid(int[] LL, int[] UR, int[][] S) {
        int N = S.length;
        int kL, kR;
        kL = kR = 0;

        for (int i = 0; i < N; i += 1) { // row
            for (int j = 0; j < N; j += 1) { // column
                if (i < j) {
                    S[i][j] = UR[kR];
                    kR += 1;
                } else if (i > j) {
                    S[i][j] = LL[kL];
                    kL += 1;
                }
            }
        }
    }
}
