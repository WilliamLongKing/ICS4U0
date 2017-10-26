package binaryTree;

public class MyBinaryTree {
	private int NumInTree;
	private StudentInfo root;
	
	public MyBinaryTree() {
		NumInTree = 0;
		root = null;
	}
	
	public void addToTree(StudentInfo currentNode, StudentInfo itemToAdd) {
		//adds the targeted StudentInfo to the binary tree
		if(NumInTree == 0) {
			//adds an item to the tree if it is empty (very first node)
			root = itemToAdd;
			NumInTree++;
		}
		else {
			//compare the student numbers of the current node and the item to add (go left is item is less than current, right if more)
			if(itemToAdd.getStudentNumber() > currentNode.getStudentNumber()) {
				if(currentNode.getRight() == null) {
					//if the node is empty then the reference value can be stored
					currentNode.setRight(itemToAdd);
					NumInTree++;
				}
				else {
					//if the node is not empty call addToTree again with that node to continue until an empty node is reached
					addToTree(currentNode.getRight(), itemToAdd);
				}
			}
			else if(itemToAdd.getStudentNumber() < currentNode.getStudentNumber()) {
				//repeat for the left side
				if(currentNode.getLeft() == null) {
					currentNode.setLeft(itemToAdd);
					NumInTree++;
				}
				else {
					addToTree(currentNode.getLeft(), itemToAdd);
				}
			}			
		}
		
	}
	
	public void inOrder(StudentInfo currentNode) {
		//traverse LST, process node, traverse RST
		//each of the three traversals use recursion until the left/rightmost nodes are reached
		if (currentNode.getLeft() != null) {
			inOrder(currentNode.getLeft());
		}
		
		System.out.println(currentNode.getStudentNumber());
		
		if (currentNode.getRight() != null) {
			inOrder(currentNode.getRight());
		}
	}
	
	public void preOrder(StudentInfo currentNode) {
		//process node, traverse LST, traverse RST
		System.out.println(currentNode.getStudentNumber());
		
		if (currentNode.getLeft() != null) {
			preOrder(currentNode.getLeft());
		}
		
		if (currentNode.getRight() != null) {
			preOrder(currentNode.getRight());
		}

	}
	
	public void postOrder(StudentInfo currentNode) {
		//traverse LST, traverse RST, process node
		if (currentNode.getLeft() != null) {
			postOrder(currentNode.getLeft());
		}
		
		if (currentNode.getRight() != null) {
			postOrder(currentNode.getRight());
		}

		System.out.println(currentNode.getStudentNumber());
		
	}
	
	public StudentInfo getRoot() {
		return root;
	}
}
