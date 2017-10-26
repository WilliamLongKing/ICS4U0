package binaryTree;

public class TestBinaryTree {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instantiate Binary Tree
		MyBinaryTree theBinaryTree = new MyBinaryTree();
		
		//Add Test Cases
        StudentInfo randomStudent = new StudentInfo(7, "Mira", "Yadav");
        theBinaryTree.addToTree(theBinaryTree.getRoot(), randomStudent);
        randomStudent = new StudentInfo(11, "Catherine", "Lam");
        theBinaryTree.addToTree(theBinaryTree.getRoot(), randomStudent);
        randomStudent = new StudentInfo(2, "Linda", "Zheng");
        theBinaryTree.addToTree(theBinaryTree.getRoot(), randomStudent);
        randomStudent = new StudentInfo(5, "Grace", "Fan");
        theBinaryTree.addToTree(theBinaryTree.getRoot(), randomStudent);
        randomStudent = new StudentInfo(20, "Dan", "Howell");
        theBinaryTree.addToTree(theBinaryTree.getRoot(), randomStudent);
        randomStudent = new StudentInfo(16, "Phil", "Lester");
        theBinaryTree.addToTree(theBinaryTree.getRoot(), randomStudent);
        randomStudent = new StudentInfo(9, "David", "Dobrik");
        theBinaryTree.addToTree(theBinaryTree.getRoot(), randomStudent);
        randomStudent = new StudentInfo(12, "Jason", "Nash");
        theBinaryTree.addToTree(theBinaryTree.getRoot(), randomStudent);
        randomStudent = new StudentInfo(1, "Liza", "Koshy");
        theBinaryTree.addToTree(theBinaryTree.getRoot(), randomStudent);
        randomStudent = new StudentInfo(6, "Parita", "Yadav");
        theBinaryTree.addToTree(theBinaryTree.getRoot(), randomStudent);
        
        //Call the Traversals
        System.out.println("In Order Traversal");
        theBinaryTree.inOrder(theBinaryTree.getRoot());
        System.out.println();
        
        System.out.println("Pre Order Traversal");
        theBinaryTree.preOrder(theBinaryTree.getRoot());
        System.out.println();

        System.out.println("Post Order Traversal");
        theBinaryTree.postOrder(theBinaryTree.getRoot());
        System.out.println();
	}

}
