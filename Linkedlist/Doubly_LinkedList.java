class Node {

    int data;
    Node next;
    Node back;
    Node(int data1,Node next1,Node back1){
        this.data=data1;
        this.next=next1;
        this.back=back1;
    }
    public static Node convertArr2DLL(int [] arr){
       if(arr.length==0){return null;}
        Node head=new Node(arr[0], null, null);
        Node prev=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i], null, prev);
            prev.next=temp;
            prev=temp;
        }
        return head;  
    }
}
public class Doubly_LinkedList{
    public static void main(String[] args) {
        int [] arr={1,4,5,6,7};
        Node head=Node.convertArr2DLL(arr);
        System.out.println(head.data);


        
    }

}