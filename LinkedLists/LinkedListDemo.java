class Node{
    int data;
    Node next;
    Node(int data , Node next){
        this.data = data;
        this.next = next;
    }
    Node(int data){
        this.data = data;
        this.next =  null;
    } 
}
public class LinkedListDemo {
    static Node convertArrayTOLL(int[] arr){
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
    static void display(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    static void search(Node head,int data){
        Node current = head;
        int flag = 0;
        while(current != null){
            if(current.data == data){
                System.out.println("Element found");
                flag =1 ;
            }
            current = current.next;
        }
        if(current == null && flag==0) System.out.println("element not found");
    }
    static int findLen(Node head){
        Node current = head;
        int count = 0;
        while(current != null){
            current = current.next;
            count++;
        }
        return count;
    }

    static Node DeleteHead(Node head){
        if(head == null) return head;
        head = head.next;
        return head;
    }
    static Node DeleteTail(Node head){
        if(head == null || head.next == null) return null;
        Node temp = head;
        while(temp.next.next != null){
         temp = temp.next;
        }
        temp.next = null;
        
        return head;
    }
    
    static Node DeleteK(Node head, int k){
        if(head==null ) return head;
        if(k==1){
            head = head.next;
            return head;
        }
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            if(count==k-1){
                temp.next =  temp.next.next;
                break;
            }
            temp = temp.next;


        }
        return head;
    }

    static Node Deleteele(Node head, int ele){
        if(head==null ) return head;
        if(head.data == ele){
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while(temp != null){
           if(temp.data == ele){
            prev.next = prev.next.next;
            break;
           }
           prev = temp;
           temp = temp.next;


        }
        return head;
    }
    static Node insertAtHead(int val,Node head){
        return new Node(val,head);   
    }
    static Node insertAtTail(int val,Node head){
        if(head == null) return new Node(val);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(val);
        return head;
    }
    static Node insertK(int val,int k,Node head){
        Node x = new Node(val);
        if(head == null) return head;
        if(k==1) return new Node(val,head);
        Node temp = head;
        int count =0;
        while(temp.next!=null){
            count++;
            if(count==k-1){
               x.next = temp.next;
               temp.next = x;
               break;
            }
            temp = temp.next;
        }
        return head;
    }
    static Node insertBeforeValue(int val,int key,Node head){
        if(head == null) return null;
        if(head.data == key){
            return new Node(val, head);
        }
        Node temp = head;
        while(temp.next!=null){
            if(temp.next.data == key){
                Node x = new Node(val);
                x.next = temp.next;
                temp.next = x;
                 break;
            }
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        // Scanner obj = new Scanner(System.in);
        // System.out.print("Enter the number of elements in the array:");
        // int n = obj.nextInt();
        // int[] arr = new int[n];
        // System.out.println("Enter the elements of the array:");
        // for(int i=0;i<n;i++){
        //     arr[i] = obj.nextInt();
        // }
        // Node head = convertArrayTOLL(arr);
        // display(head);
        // System.out.println();
        // System.out.println("Enter the element to search:");
        // int ele = obj.nextInt();
        // search(head,ele);
        // System.out.println("Length of the linked list is: "+findLen(head));
        // Node head1 = Deleteele(head,3);
        // display(head1);
       
        // head = insertBeforeValue(100, 2, head);
        int[] arr = {1,2,3,4,5};
        Node head = convertArrayTOLL(arr);
        head = DeleteK(head, 3);
        display(head);
        //obj.close()
    }
}
