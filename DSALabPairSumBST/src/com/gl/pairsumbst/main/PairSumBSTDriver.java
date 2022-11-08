package com.gl.pairsumbst.main;

import com.gl.pairsumbst.model.Node;
import com.gl.pairsumbst.model.Tree;

public class PairSumBSTDriver {

	public static void main(String[] args) {
		Node root = new Node(40);
		Tree binaryTree = new Tree(root);
		binaryTree.root.left = new Node(20);
		binaryTree.root.right = new Node(60);
		root.left.left = new Node(10);
		root.left.right = new Node(30);
		root.right.left = new Node(50);
		root.right.right = new Node(70);
		binaryTree.isSum(120, root);

	}
}
