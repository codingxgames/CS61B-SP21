public class test {
    public static void sort(String[] x) {
        sort(x, 0);
    }

    private static void sort(String[] x, int start) {
        if (start == x.length) {
            return;
        }

        int smallestIndex = findSmallestIndex(x, start);
        swap(x, start, smallestIndex);
        sort(x, start + 1);
    }

    public static int findSmallestIndex(String[] x, int start) {
        int smallestIndex = start;
        for (int i = start; i < x.length; i += 1) {
            int cmp = x[i].compareTo(x[smallestIndex]);
            if (cmp < 0) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(String[] x, int a, int b) {
        String temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }
}
