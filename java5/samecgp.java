 class Student implements Comparable<Student> {
	private int rollNo;
	private String name;
	private float cgpa;

	public Student(int rollNo, String name, float cgpa) {
		this.name = name;
		this.rollNo = rollNo;
		this.cgpa = cgpa;
	}

	@Override
	public int compareTo(Student o) {
		if (o == null)
			return +1;
		if (this.cgpa < o.cgpa)
			return -1;
		if (this.cgpa > o.cgpa)
			return +1;
		return 0;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", cgpa=" + cgpa + "]";
	}
}

public class samecgp<K extends Comparable<K>> {
	private Node root;
public void insert(K key) {
		root = insert(root, key);
	}

	private Node insert(Node n, K key) {
		if (n == null)
			return new Node(key,1);
		
		int cmp = key.compareTo(n.key);

		if (cmp == 0)
			n.value = n.value +1;
		else if (cmp > 0)
			n.right = insert(n.right, key);
		else
			n.left = insert(n.left, key);
		return n;
	}

	public void inOrder() {
		inOrder(root);
	}

	private void inOrder(Node n) {
		if (n == null)
			return;
		inOrder(n.left);
		System.out.println(n.key + " : " + n.value);
		inOrder(n.right);
	}

	private class Node {

		private K key;
		private int value;
		private Node left;
		private Node right;

		public Node(K key, int value) {
			this.key = key;
			this.value = value;
		}

	}
	
	

	public static void main(String[] args) {
		samecgp<Student> bst = new samecgp<>();
		bst.insert(new Student(1, "a", 1.2f));
		bst.insert(new Student(2, "b", 5.2f));
		bst.insert(new Student(3, "c", 5.2f));
		bst.insert(new Student(4, "d", 9.2f));
		bst.insert(new Student(5, "e", 4.2f));
		bst.insert(new Student(6, "f", 3.2f));
		bst.inOrder();
		
	}

}