package 알고리즘;

public class Example4 {
	static class Node {
		int value;
		Node next;

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}

		public void printAll() {
			System.out.print(value + " ");
			if (this.next != null)
				this.next.printAll();
		}

		// 남수 help
		public void addTail(int value) {
			if (this.next != null) {
				next.addTail(value);
				System.out.println(next.toString());
			} else {
				next = new Node(value, null);
				System.out.println(this.value + "  " + next.toString());
			}
		}

		@Override
		public String toString() {
			return "Node [value=" + value + ", next=" + next + "]";
		}

	}

	public static void main(String[] args) {
		Node root = new Node(0, null);
		for (int i = 1; i <= 10; ++i)
			root.addTail(i);
		root.printAll();
	}
}
