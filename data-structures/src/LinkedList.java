
public class LinkedList<X> {

	public static void main(String[] args) {
		System.out.println("IT'S WORKING");
	}

	private Node head;
	
	// CONSTRUCTOR 
	public LinkedList() {
		head = null;
	}
	
	// FUNCTIONS

	// ADD NEW NODE TO LIST FROM INPUT DATA
	public void add(X data) {
		Node newNode = new Node(data);
		newNode.setNextNode(head);
		head = newNode;
	}
	
	// SEARCH FOR NODE
	public boolean search(X data) {
		Node current = head;
		while (current != null) {
			if(current.data.equals(data)) {
				return true;
			} else {
				current = current.nextNode;
			}
		}
		return false;
	}
	
	// RETURN COUNT OF NODES
	public int count() {
		Node current = head;
		int count = 0;
		while(current != null) {
			count += 1;
			current = current.nextNode;
		}
		return count;
	}
	
	// RETURN VALUE AT THE NTH NODE FROM BEGINNING
	public X valueAt(int n) {
		int count = 0;
		Node current = head;
		while(count != n) {
			count += 1;
			current = current.nextNode;
		}
		return current.data;
	}
	
	// MAX VALUE IN THE LINKED LIST RETURNS DATA VALUE, NOT NODE
//	public X max() {
//		X max = head.data;
//		Node current = head.nextNode;
//		while (current != null) {
//			if(current.data > max) {
//				max = current.data;
//			}
//			current = current.nextNode;
//		}
//		return max;
//	}
	
	
	// NODE CLASS
	private class Node {

		private Node nextNode;
		private X data;

		public Node(X item) {
			this.nextNode = null;
		}

		public Node getNextNode() {
			return nextNode;
		}

		public void setNextNode(Node nextNode) {
			this.nextNode = nextNode;
		}

		public X getData() {
			return data;
		}

		public void setData(X data) {
			this.data = data;
		}

	}

}
