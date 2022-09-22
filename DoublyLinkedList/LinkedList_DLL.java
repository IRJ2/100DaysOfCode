public class LinkedList_DLL {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.CreateDLL(10);
        
        dll.InsertDLL(1,0);
        dll.InsertDLL(2,0);
        dll.InsertDLL(3,0);
        dll.InsertDLL(4,0);
        dll.InsertDLL(5,0);
        dll.InsertDLL(6,0);

        dll.traverseDLL();
        // dll.reverseTraversal();
        // dll.searchNode(3);
        // dll.deleteNode(2);
        // dll.traverseDLL();
        dll.deleteDLL();
        dll.traverseDLL();
        
    }
}
