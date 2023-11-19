public class SLList {
    /** nested class of IntNode */
    public class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) { // constructor
            item = i;
            next = n;
        }
    }

    private IntNode sentinel;
    private int size;

    /** constructor: empty SLList with sentinel node */
    public SLList(){
        sentinel = new IntNode(63, null);
        size = 0;
    }

    /** constructor: unempty SLList */
    public SLList(int x) {
        sentinel = new IntNode(63, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    /** add node to the front of the list */
    public void addFirst(int x) {
        sentinel.next = new IntNode(x, sentinel.next);
        size += 1;
    }

    public int getFirst(){
        return sentinel.next.item;
    }

    /** add x to the end of list */
    public void addLast(int x) {
        size += 1;
        IntNode p = sentinel;

        /** advance p to the end of list */
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }

    /** return the list size */
    public int size() {
        return size;
    }

    public static void main(String[] arg) {
        SLList L = new SLList(10);
        L.addLast(20);
        System.out.println(L.size());
    }



}