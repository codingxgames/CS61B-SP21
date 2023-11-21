package week3;

public class SLList<Blorp> implements List61B<Blorp> {
    private class Node {
        public Blorp item;
        public Node next;

        public Node(Blorp i, Node n) {
            item = i;
            next = n;
        }
    }

    private Node sentinel;
    private int size;

    public SLList() {
        sentinel = new Node(null, null);
        size = 0;
    }

    public SLList(Blorp x) {
        sentinel = new Node(null, null);
        sentinel.next = new Node(x, null);
        size = 1;
    }

    public void insert(Blorp item, int position) {
        Node p = sentinel;
        while (position > 1 && p.next != null) {
            position--;
            p = p.next;
        }
        Node newNode = new Node(item, p.next);
        p.next = newNode;
    }

    public void addFirst(Blorp x) {
        sentinel.next = new Node(x, sentinel.next);
        size += 1;
    }

    public Blorp getFirst() {
        return sentinel.next.item;
    }

    public void addLast(Blorp x) {
        size += 1;

        Node p = sentinel;

        while (p.next != null) {
            p = p.next;
        }
        p.next = new Node(x, null);
    }

    public Node getLastNode() {
        Node p = sentinel;

        while (p.next != null) {
            p = p.next;
        }
        return p;
    }

    public Blorp getLast() {
        Node back = getLastNode();
        return back.item;
    }

    public Blorp get(int i) {
        return get(i, sentinel.next);
    }

    public Blorp get(int i, Node p) {
        if (i == 0) {
            return p.item;
        }
        return get(i - 1, p.next);
    }

    public int size() {
        return size;
    }

    public Blorp removeLast() {
        Node back = getLastNode();
        if (back == sentinel) {
            return null;
        }

        Node p = sentinel;

        while (p.next != back) {
            p = p.next;
        }
        p.next = null;
        return back.item;
    }

    @Override
    public void print() {
        System.out.println("THIS IS THE OVERRIDE VIRSION");
        Node p = sentinel.next;
        while (p != null) {
            System.out.print(p.item + " ");
            p = p.next;
        }
    }

    public static void main(String[] args) {
        SLList L = new SLList();
        L.addLast(20);
        System.out.println(L.size());
    }
}
