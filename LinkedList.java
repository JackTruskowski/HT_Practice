public class LinkedList {
    public int len = 0;
    public LLNode head = null;

    public void insertInFront(int value){
	LLNode newNode = new LLNode(value);
	LLNode temp = head;
	head = newNode;
	head.next = temp;
	len++;
    }

    public void insertInBack(int value){
	LLNode newNode = new LLNode(value);
	if (head == null){
	    head = newNode;
	    len++;
	    return;
	}
	
	LLNode it = head;
	while (it.next != null){
	    it = it.next;
	}
	it.next = newNode;
	len++;
	
    }

    public void printLL(){
	System.out.print("[");
	LLNode it = head;
	while(it != null){
	    System.out.print(it.getValue());
	    if(it.next != null) System.out.print("->");
	    it = it.next;
	}
	System.out.print("]");
    }

}

