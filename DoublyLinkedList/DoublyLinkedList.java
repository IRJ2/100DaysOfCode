public class DoublyLinkedList {
    public DoublyNode head;
    public DoublyNode tail;
    public int size;

    public DoublyNode CreateDLL(int nodeValue){
        DoublyNode node = new DoublyNode();
        node.value = nodeValue;
        node.prev = null;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
        return head;
    }
    // Insertion
    public DoublyNode InsertDLL(int nodeValue, int location){
        DoublyNode node = new DoublyNode();
        node.value = nodeValue;
        node.prev = null;
        node.next = null;
        if(head == null){
            CreateDLL(nodeValue);
            return head;
        }
        else if(location == 0){
            node.next = head;
            head.prev = node;
            head = node;
            
        }
        else if(location >= size){
            node.prev = tail;
            tail.next = node;
            tail = node;
        }
        else{
            int index = 0;
            DoublyNode temp = head;
            for(int i = 0;i < location - 1; i++){
                temp = temp.next;
                index++;
            }
            node.next = temp.next;
            node.prev = temp;
            temp.next = node;
            temp.next.prev = node;
        }
        size++;
        return head;
    }
    // Traversal
    public void traverseDLL(){
        if(head != null){
            DoublyNode temp = head;
            while(temp != null){
                System.out.print(temp.value);
                if(temp.next != null){
                    System.out.print("-->");
                }
                temp = temp.next;
            }
        }
        else{
            System.out.print("Doubly linked list is empty!!");
        }
    }
    // Reverse Traversal
    public void reverseTraversal(){
        if(head != null ){
            DoublyNode temp = tail;
            for(int i = 0; i < size; i++){
                System.out.print(temp.value);
                if(i != size -1){
                    System.out.print("-->");
                }
                temp = temp.prev;
            }
        }
        else{
            System.out.print("The linked list is empty!");
        }
    }
    // Searching
    public boolean searchNode(int key){
        if(head != null){
            DoublyNode temp = head;
            for(int i = 0; i < size;i++){
                if(temp.value == key){
                    System.out.println("Found at index "+ i);
                    return true;
                }
                temp = temp.next;
            }
        }
        System.out.println("Not found!");
        return false;
    }
    // Delete node
    public void deleteNode(int location){
        if(head == null){
            System.out.print("DLL is empty!\n");
            return;
        }
        else if(head == tail){
            head = tail = null;
        }
        else if(location == size){
            tail = tail.prev;
            tail.next = null;
        }
        else{
            DoublyNode curr = head;
            for(int i = 0; i < location-1;i++){
                curr = curr.next;
            }
            curr.next = curr.next.next;
            curr.next.prev = curr;
        }
        size--;
        return;
    }
    // Delete DLL
    public void deleteDLL(){
        DoublyNode temp = head;
        for(int i = 0;i < size;i++){
            temp.prev = null;
            temp = temp.next;
        }
        head = null;
        tail = null;
        System.out.println("\nThe DLL has been deleted!");
    }

}
