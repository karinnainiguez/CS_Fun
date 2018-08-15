
public class LinkedList<X> {

	public static void main(String[] args) {
		System.out.println("IT'S WORKING");
	}
	
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

	private Node head;
	
	// CONSTRUCTOR 
	public LinkedList() {
		head = null;
	}
	
	
	
	// FUNCTIONS

	// 1. ADD NEW NODE TO LIST FROM INPUT DATA
	public void add(X data) {
		Node newNode = new Node(data);
		newNode.setNextNode(head);
		head = newNode;
	}
	
	// 2. SEARCH FOR NODE WITH SPECIFIC INPUT DATA
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
	
//	// 3. MAX VALUE IN THE LINKED LIST RETURNS DATA VALUE, 
//	// NOT NODE (NOT applicable in Java with X data)
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
	
//		// 4. MIN VALUE IN THE LINKED LIST RETURNS DATA VALUE, 
//		// NOT NODE (NOT applicable in Java with X data)
//		public X min() {
//			X min = head.data;
//			Node current = head.nextNode;
//			while (current != null) {
//				if(current.data < min) {
//					min = current.data;
//				}
//				current = current.nextNode;
//			}
//			return min;
//		}
	
	
	// 5. RETURN COUNT OF NODES
	public int count() {
		Node current = head;
		int count = 0;
		while(current != null) {
			count += 1;
			current = current.nextNode;
		}
		return count;
	}
	
	// 6. RETURN VALUE AT THE NTH NODE FROM BEGINNING
	public X valueAt(int n) {
		int count = 0;
		Node current = head;
		while (count != n) {
			count += 1;
			current = current.nextNode;
		}
		return current.data;
	}
	
	
//	// 7. INSERT A NEW NODE WITH SPECIFIC DATA 
//	// ASSUMING LIST IS SORTED BY ASCENDING VALUES
//	// (NOT applicable with Java X Data)
//	public void insert(X data) {
//		if (head == null) {
//			head = new Node(data);
//		} else {
//			Node current = head;
//			while (current.nextNode != null && current.nextNode < data) {
//				current = current.nextNode;
//			}
//			if(current.nextNode == null) {
//				current.nextNode = new Node(data);
//			} else {
//				Node newNode = new Node(data);
//				newNode.setNextNode(current.nextNode);
//				current.nextNode = newNode;
//			}
//		}
//	}
	
	
	
	// 8. PRINT VALUE OF EACH NODE SEPARATED BY SPACE
	public void printVals() {
		Node current = head;
		while (current != null) {
			System.out.println(current.data + " ");
		}
	}
	
	// 9. DELETE FIRST NODE FOUND WITH SPECIFIC DATA
	
	// 10. REVERSE LIST (NODES SHOULD BE PRESERVED)
	
	// 11. RETURN VALUE AT MIDDLE NODE.  IF NODE COUNT
	// IS EVEN, PICK ONE OF THE TWO MIDDLE VALUES TO RETURN
	

	// 12. FIND NTH NODE FROM END AND RETURN VALUE.

	
	// 13. CHECK IF LIST HAS A CYCLE. CYCLE EXISTS IF ANY
	// NODE IN LIST LINKS TO A NODE ALREADY VISITED. 
	// RETURNS BOOLEAN

	

}
