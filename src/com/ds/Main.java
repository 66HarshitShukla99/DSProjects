package com.ds;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	
	public static void main(String[] args) {
		
		BinaryTree root = new BinaryTree();
		root.setData(10);
		BinaryTree n1=new BinaryTree();
		BinaryTree n2= new BinaryTree();
		BinaryTree n3= new BinaryTree();
		BinaryTree n4 = new BinaryTree();
		BinaryTree n5 = new BinaryTree();
		BinaryTree n6 = new BinaryTree();
		n2.setData(20);
		n3.setData(30);
		n4.setData(40);
		n5.setData(50);
		n6.setData(60);
		
		root.setLeft(n2);
		root.setRight(n3);
		n3.setLeft(n4);
		n3.setRight(n5);
		//n5.setLeft(n6);
		//inorder(root);
		//preorder(root);
		//printRightSubview(root);
		//Integer count=0;
		System.out.println(printHeightOfBinaryTree(root)+1);
		//levelOrderTraversal(root);
	}
	private static int printHeightOfBinaryTree(BinaryTree root) {
		try {
		int count=0;
		if(root!=null) {
		if(root.getLeft() ==null && root.getRight()==null) {
			return count++;
		}
			count++;
			count+=Math.max(printHeightOfBinaryTree(root.getLeft()),printHeightOfBinaryTree(root.getRight()));
		}
		return count;
		}catch(Exception e) {
			//e.printStackTrace();
			throw e;
		}
	}
	private static void levelOrderTraversal(BinaryTree node) {
		Queue<BinaryTree> q= new LinkedList<>();
		q.add(node);
		while(!q.isEmpty()) {
			System.out.println(q.peek().getData());//10,20
			BinaryTree temp = q.poll();
			if(temp.getLeft()!=null) {
			q.add(temp.getLeft());//20
			}
			if(temp.getRight()!=null) {
			q.add(temp.getRight());//30
			}
		}
		
	}
	private static void printRightSubview(BinaryTree root) {
		//Level order traversal from right side of the tree
		System.out.println(root.getData());
		if(root.getRight()!=null) {
		printRightSubview(root.getRight());
		}
		else if(root.getLeft()!=null) {
			printRightSubview(root.getLeft());
		}
		else return;
		
	}
	public static void inorder(BinaryTree node) {
		//20 10 40 30
		if(node==null) {
			//System.out.println(node.getData());
			return;
		}
		inorder(node.getLeft());
		System.out.println(node.getData());
		inorder(node.getRight());
	}
	public static void preorder(BinaryTree node) {
		if(node==null) {
			//System.out.println(node.getData());
			return;
		}
		System.out.println(node.getData());
		preorder(node.getLeft());
		//System.out.println(node.getData());
		preorder(node.getRight());
	}
	
}
