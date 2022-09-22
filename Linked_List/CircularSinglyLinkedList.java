public class CircularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createCSLL(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;

        head= node;
        tail= node;
        size = 1;

        return head;
    }
    public Node inserCSLL(int nodevalue , int location){
        Node node = new Node();
        node.value = nodevalue;
        if(head == null){
            createCSLL(nodevalue);
        }
        else if(location == 0){
            node.next = head.next;
            head = node;
            tail.next = head;
            size++;
        }
        else if(location >= size){
            tail.next = node;
            node.next = head;
            tail = node;
            size++;
        }
        else{
            int index = 0;
            Node temp = head;
            while(index < location -1){
                temp = temp.next;
                index++;
            }
            node.next = temp.next;
            temp.next = node;
            size++;
        }
        
        return head;
    }

    public void traverseCSLL(){
        Node temp = head;
        if(head != null){
            for(int i = 0; i < size; i++){
                System.out.print(temp.value);
                if(i != size - 1){
                    System.out.print("-->");
                }
                temp = temp.next;
            }
            System.out.println();
        }
        else{
            System.out.print("Empty!");
        }
    }

    public boolean searchCSLL(int nodevalue){
        if(head != null){
            Node temp = head;
            for(int i = 0; i < size; i++){
                if(temp.value == nodevalue){
                    System.out.print("Found at index" + i);
                    return true;
                }
                temp = temp.next;
            }
        }
        System.out.println("Not found");
        return false;
    }

}
