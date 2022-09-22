public class CircularDoublyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createCDLL(int nodevalue){
        Node node = new Node();
        node.value = nodevalue;
        node.prev = node;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }
    void insertNode(int nodeValue, int location) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        if (head == null) {
          createCDLL(nodeValue);
          return;
        } else if (location == 0) {
          newNode.next = head;
          newNode.prev = tail;
          head.prev = newNode;
          tail.next = newNode;
          head = newNode;
        } else if (location >= size) {
          newNode.next = head;
          newNode.prev = tail;
          head.prev = newNode;
          tail.next = newNode;
          tail = newNode;
        } else {
          Node tempNode = head;
          int index = 0;
          while (index < location -1) {
            tempNode = tempNode.next;
            index++;
          }
          newNode.prev = tempNode;
          newNode.next = tempNode.next;
          tempNode.next = newNode;
          newNode.next.prev = newNode;
        }
        size++;
      }
    // public Node insertCDLL(int nodevalue, int location){
    //     Node node = new Node();
    //     node.value = nodevalue;
    //     node.prev = null;
    //     node.next = null;
    //     if(head == null){
    //         createCDLL(nodevalue);
    //         return head;
    //     }
    //     else if(location == 0){
    //         node.next = head;
    //         node.prev = tail;
    //         head.prev = node;
    //         tail.next = node;
    //         head = node;
    //     }
    //     else if(location >= size){
    //         node.prev = tail;
    //         node.next = head;
    //         tail.next = node;
    //         head.prev = node;
    //         tail = node; 
    //     }
    //     else{
    //         Node temp = head;
    //         for(int i =0; i < size -1;i++){
    //             temp = temp.next;
    //         }
    //         node.next = temp.next;
    //         node.prev = temp;
    //         temp.next.prev = node;
    //         temp.next = node;
    //     }
    //     size++;
    //     return head;
    // }
    // Traverse CDLL
    public void traverseCDLL(){
        if(head != null ){
            Node curr =head;
            for(int i = 0;i < size; i++ ){
                System.out.print(curr.value);
                if(i != size - 1){
                    System.out.print("-->");
                }
                curr = curr.next;
            }
        }
        else {
            System.out.println("The CDLL does not exist.");
        }
        System.out.println();
    }
    // Reverse Traversal
    void reverseTraversalCDLL() {
        if (head != null) {
        Node tempNode = tail;
        for (int i=0; i<size; i++) {
            System.out.print(tempNode.value);
            if (i != size-1) {
            System.out.print("<--");
            }
            tempNode = tempNode.prev;
        }

        } else {
        System.out.println("The CDLL does not exist!");
        }
    }
    public boolean searchCDLL(int nodevalue){
      if(head != null){
        Node curr = head;
        for(int i = 0;i < size; i++){
          if(curr.value == nodevalue){
            System.out.println("Found!");
            return true;
          }
          curr = curr.next;

        }
        
      }
      System.out.println("Not found!");
      return false;
    }

    public void deleteNode(int location){
      if(head == null){
        System.out.print("Empty!");
      }
      else if(location == 0){
        if(size == 1){
          head = tail = null;
          head.prev = null;
          tail.next = null;
          size = 0;
          return;
        }
        else{
          head = head.next;
          head.prev = tail;
          tail.next = head;
          size--;
        }
        return;
      }
      else if(location >= size){
        if(size == 1){
          head = tail = null;
          head.prev = null;
          tail.next = null;
          head.prev = tail;
          size--;
        }
        else{
          tail = tail.prev;
          tail.next = head;
          head.prev = tail;
          size--;
        }
        return;
      }
      else{
        Node cur = head;
        for(int i = 0; i < location - 1; i++){
          cur = cur.next;
        }
        cur.next = cur.next.next;
        cur.next.prev = cur;
        size--;
        return;

      }
      return;
    }
    public void deletecdll() {
      Node curr = head;
      for(int i = 0; i < size; i++){
        curr.prev = null;
        curr = curr.next;
      }
      head= null;
      tail = null;
      size = 0;
      System.out.println("The CDLL is deleted");
      return;
    }
    
    
}
