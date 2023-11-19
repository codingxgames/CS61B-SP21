/**
 * 8 primitive types 基本数据类型 （值传递）：
 * byte, short, int, long, float, double, boolean, char
 * reference types 引用类型：除了primitive types之外的都是 reference types，包括arrays
 * 9 types of variable : 8 primitive types + reference to Object(an arrow)
 * “Golden Rule of Equals”（等号的黄金规则）：
 * 1. 使用 == 来判断两个引用是否指向堆中的同一个对象。
 * 2. 使用 equals() 来判断两个对象的内容是否相等。
 */
public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    /** return the size of the list using recursion */
    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + this.rest.size(); // 这里的this也可不用
    }

    /** return the size of the list using no recursion */
    public int iterativeSize() {
        IntList p = this;  // this关键字是对当前对象的引用。它可以在方法或构造器中使用，来引用当前对象的属性和方法。
        int totalSize = 0;
        while (p != null) {
            totalSize += 1;
            p = p.rest;
        }
        return totalSize;
    }

    /** return the ith item of this IntList */
    public int get(int i) {
        if (i == 0) {
            return first;
        }
        return rest.get(i - 1); // this可用可不用
    }

    public static void main(String[] args) {
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(5, L);

        System.out.println(L.get(1));
    }

}


