
public class LinkedList<X> {

	public static void main(String[] args) {
		System.out.println("IT'S WORKING");
	}

	private Node head;

	public LinkedList() {
		head = null;
	}

	// ADD NEW NODE TO LIST FROM INPUT DATA
	public void add(X data) {
		Node newNode = new Node(data);
		newNode.setNextNode(head);
		head = newNode;
	}

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
