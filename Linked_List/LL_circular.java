public class LL_circular {
    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.inserCSLL(0, 0);
        csll.inserCSLL(1, 1);
        csll.inserCSLL(2, 8);
        csll.inserCSLL(2, 8);
        csll.inserCSLL(2, 8);
        csll.inserCSLL(2, 8);
        csll.inserCSLL(2, 8);

        csll.traverseCSLL();
        csll.searchCSLL(6);

    }
}