package week3;

public class IntList2 {
    public int first;
    public IntList2 rest;
    public IntList2(int f, IntList2 r) {
        this.first = f;
        this.rest = r;
    }

    public static void evenOdd(IntList2 lst) {
        if (lst == null || lst.rest == null) {
            return;
        }
        IntList2 oddList = lst.rest;
        IntList2 second = lst.rest;
        while (lst.rest != null && oddList.rest != null) {
            lst.rest = lst.rest.rest; // even
            oddList.rest = oddList.rest.rest; //odd
            lst = lst.rest; // 下一个even
            oddList = oddList.rest; // 下一个odd
        }
        lst.rest = second; //even遍历后，指向第一个odd

    }


}
