class Node {

    int data;
    Node next;
    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;

    }
    public static Node insertAtK(Node head,int value, int k){
        if(head==null){
            if(k==1){return new Node(value, null);}
        }
        if(k==1){
            head=new Node(value, head);
            return head;
        }
        int counter=0;
        Node temp=head;
        
        while(temp!=null){
            counter++;
            if(counter==(k-1)){
                Node newnode=new Node(value, null);
                newnode.next=temp.next;
                temp.next=newnode;
                return head;
                
            }
            temp=temp.next;
        }return head;
        
    }
    public static Node insertAtStart(Node head,int value){
        Node newhead=new Node(value,head);
        return newhead;

    }
    public static Node insertAtLast(Node head,int value){
        if(head==null){return new Node(value, head);}
        Node newnode= new Node(value, null);
        Node temp=head;
        while(temp.next!=null){
           temp=temp.next;
        }
        temp.next=newnode;
        return head;
    }
    public static Node deleteAnyElement(Node head,int k){
        if(head==null){return head;}
        if(k==1){
            Node temp=head;
            head=head.next;
            return head;
        }
       int count=0;
       Node prev=null;
       Node temp=head;
       while(temp!=null){
        count++;
        if(count==k){
            
             prev.next=prev.next.next;
             break;
        }
        prev=temp;
        temp=temp.next;


       }
       return head;
    }

    public static boolean  searchanelement(Node head,int element){
        Node temp=head;
        while(temp!=null){
            if(temp.data==element){
                return true;
            }
            
            temp=temp.next;
        }
        return false;
    }
    public static Node delethead(Node head){
        Node temp=head;
        head=head.next;
        return head;
    }
    public static Node deletetail(Node head){
        if(head==null || head.next==null){return head;}

        Node temp=head;
        while(temp.next.next!=null){
            
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    public static void traverseLL(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            
            temp=temp.next;
        }System.out.println();
    }
    public static Node convertArr2LL(int [] arr){
        if(arr.length==0){
            return null;
        }
        
        Node head= new Node(arr[0],null);
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i], null);
            mover.next=temp;
            mover=temp;


        }return head;


    }
   
}

public class LinkedList{
    public static void main(String[] args) {
        int [] arr1={2,3,45,7,7};
        int [] arr2={};
        Node head2=Node.convertArr2LL(arr2);
        Node head1=Node.convertArr2LL(arr1);
               //Deletion of Nodes
        //Node.traverseLL(head);
        //Boolean search = Node.searchanelement(head,20);
        //System.out.println(search);
        //head=Node.delethead(head);
        //System.out.println(head.data);
        //Node newhead=Node.deletetail(head);
        //Node.traverseLL(newhead);
        //head=Node.deleteAnyElement(head, 3);
        //Node.traverseLL(head);  
                //Insertion of Nodes
        //head1=Node.insertAtLast(head1, 100);
        //Node.traverseLL(head1);

        //head2=Node.insertAtLast(head2, 3);
        //Node.traverseLL(head2);

        //Node.insertAtK(head1, 200, 4);
        //Node.traverseLL(head1);
            
        
    }
}