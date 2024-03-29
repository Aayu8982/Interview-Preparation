// Implement a Singly Linked List and perform operations

class SinglyLinkedList{
	static class LLNode{
		int data;
		LLNode next;
		LLNode(int data){
			this.data=data;
			this.next=null;
		}
	}

	static LLNode head=null;
	static LLNode tail=null;

	static public void addNode(int data){
		LLNode newNode = new LLNode(data);
		if(head == null){
			head=newNode;
			tail=newNode;
		}else{
			tail.next=newNode;
			tail=newNode;

		}
	}

	// Deletion

	static void deleteAtStart(){
		if(head == null){
			System.out.println("Linked List is Empty");
			return;
		}
		head=head.next;
	}

	static void deleteAtEnd(){
		if(head == null){
			System.out.println("Linked List is Empty");
			return;
		}

		if(head == null){
			head=null;
			return;
		}

		LLNode last=head;
		LLNode secondLast=null;

		while(last.next !=null){
			secondLast=last;
			last=last.next;
		}
		secondLast.next=null;
	}

	static void deleteAtPosition(int pos){
		if(head == null){
			System.out.println("Linkedlist is Empty");
		}

		if(pos == 0){
			head=head.next;
			return;
		}

		LLNode temp=head;
		
		for(int i=0;temp!=null && i<pos-1;i++){
			temp=temp.next;
		}

		if(temp == null || temp.next == null){
			return;
		}

		temp.next=temp.next.next;
	}

	// Insertion
	static void insertAtStart(int data){
		LLNode newNode= new LLNode(data);
		newNode.next=head;
		head=newNode;
	}

	static void insertAtEnd(int data){
		LLNode newNode=new LLNode(data);
		LLNode temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=newNode;
	}

	static void insertAtPos(int data,int pos){
		LLNode newNode=new LLNode(data);
		LLNode temp=head;
		int i=0;
		while(i<pos-1){
			temp=temp.next;
			i++;
		}
		newNode.next=temp.next;
		temp.next=newNode;
	}

	// display

	static void display(){
		LLNode temp = head;
		if(head == null){
			System.out.println("Linkedlist is empty");
			return;
		}
		while(temp !=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}

	public static void main(String[] args){
		SinglyLinkedList s=new SinglyLinkedList();
		s.addNode(10);
		s.addNode(20);
		s.addNode(30);
		s.addNode(40);
		s.insertAtStart(5);
		s.insertAtEnd(45);
		s.insertAtPos(25,2);
		s.deleteAtStart();
		s.deleteAtEnd();
		s.deleteAtPosition(1);
		s.display();

	}
}

// Time Complexity ->O(n)
// Space Complexity -> O(1)