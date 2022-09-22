
public class LinkedList_CDLL {
    public static void main(String[] args) {
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.createCDLL(3);
        cdll.insertNode(1 , 2);
        cdll.insertNode(2 , 1);
        cdll.insertNode(4 , 1);
        cdll.traverseCDLL();
        cdll.deletecdll();
        cdll.traverseCDLL();
        
        
    }
}
