import java.util.Scanner;

public class LinkedListOperation{

	// delete key in linkedlist
	public static Node<Integer> delete(Node<Integer> head,int key){
		Node<Integer> temp =head;
		while(temp.next.data != key ){
			temp=temp.next;
		}
		temp.next=temp.next.next;
		return head;
	}

	// insert a key in linkedlist 
	public static Node<Integer> insert(Node<Integer> head, int data,int pos){
		Node<Integer> temp=head;
		Node<Integer> newNode=new Node<Integer>(data);
		if(pos==0){
			newNode.next=head;
			return newNode;
		}
		int i=0;
		while(i<pos-1){
			temp=temp.next;
			i++;
		}
		newNode.next=temp.next;
		temp.next=newNode;
		return head;
	}

	public static Node<Integer> takeInput(){
		Node<Integer> head=null,tail=null;
		Scanner s=new Scanner(System.in);
		int data = s.nextInt();

		while(data != -1){
			Node<Integer> newNode = new Node<Integer>(data);
			if(head == null){
				head=newNode;
				tail=newNode;
			}else{
				tail.next=newNode;
				tail=newNode;
			}
			data=s.nextInt();
		}
		return head;
	}

	public static void print(Node<Integer> head){
		Node<Integer> temp=head;
		while(temp !=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}

	public static void main(String[] args){
		Node<Integer> head = takeInput();
		head = insert(head,15,0);
		head = insert(head,25,3);
		head = delete(head,25);
		print(head);
	}
}