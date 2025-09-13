// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
   static class Node{
       int data;
       Node next;
       Node(int data){
           this.data = data;
           this.next = null;
       }
   }
    static Node convertArrayToLL(int[] arr){
        if(arr.length==0) return null;
        Node head = new Node(arr[0]);
        Node current = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            current.next = temp;
            current = current.next;
        }
        return head;
    }
    static void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }
    
    static Node InsertAtHead(Node head , int data){
        if(head == null) {
            return new Node(data);
        }
        Node temp = new Node(data);
        temp.next = head;
        return temp;
        
    }
    static Node InsertAtTail(Node head, int data){
         if(head == null) {
            return new Node(data);
        }
        Node newData = new Node(data);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newData;
        return head;
    }
    static Node InsertAtPos(Node head,int pos,int data){
        if(head == null){
            return new Node(data);
        }
        int count = 0;
        
        if(pos==0) return InsertAtHead(head,data);
        Node newNode = new Node(data);
        Node temp = head;
        while(temp!=null){
            count++;
            if(count==pos){
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
        
    }
    static int findSize(Node head){
        int size = 0;
        Node temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        return size;
    }
    static Node DeleteHead(Node head){
        if(head.next == null) return null;
        head = head.next;
        return head;
    }
    static Node DeleteTail(Node head){
        if(head.next == null) return null;
        Node temp = head;
        Node prev = null;
        while(temp.next != null){
            prev = temp;
            temp = temp.next;
        }
        prev.next= null;
        return head;
    }
    static void findValue(Node head,int data){
        if(head==null) System.out.print("List is Empty");
        int count = 0;
        Node temp = head;
        while(temp != null){
            if(temp.data == data) {
                System.out.print("Element found at index : "+count);
                return;
            }
            count++;
            temp = temp.next;
        }
    }
    static Node DeletePos(Node head, int pos){
        Node temp = head;
        int count = 0;
        if(pos == 0) return DeleteHead(head);
        if(pos== findSize(head)) return DeleteTail(head);
        Node prev = null;
        while(temp != null){
            count++;
            if(count==pos){
                prev.next = temp.next;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    static Node DeleteVal(Node head, int data){
        if(head.data==data) return DeleteHead(head);
        Node temp = head;
        Node prev = null;
        while(temp != null){
            if(temp.data==data){
                prev.next=temp.next;
                break;
            }
            prev = temp;
            temp = temp.next;
            
        }
        return head;
        
    }
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        Node head = convertArrayToLL(arr);
        printList(head);// 10->20->30->40->50->
        Node newHead = InsertAtHead(head,100);
        printList(newHead);
        Node newH = InsertAtTail(newHead,200);
        printList(newH);
        int size = findSize(newH);
        Node newT = InsertAtPos(newH,size,35);
        printList(newT);
        Node newS = DeleteHead(newT);
        printList(newS);
        Node newR = DeleteTail(newS);
        printList(newR);
       Node newG = DeletePos(newS,5);
       printList(newG);
       Node newF = DeleteVal(newG,200);
       printList(newF);
        
        
    }
}