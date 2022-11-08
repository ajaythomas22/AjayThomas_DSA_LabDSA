package com.gl.pairsumbst.model;

import java.util.HashSet;

public class Tree {

	public Node root;

	public Tree(Node root) {
		this.root = root;
	}

	public void isSum(int sum, Node root) {
		HashSet<Integer> set = new HashSet<Integer>();

		if (!isSum(set, root, sum)) {
			System.out.println("Pair for given Sum " + sum + " does not exist!!!");
		}
	}

	public static boolean isSum(HashSet<Integer> set, Node root, int sum) {
		if (root == null) {
			return false;
		}
		if (isSum(set, root.left, sum)) {
			return true;
		}
		if (set.contains(sum - root.data)) {
			System.out.println("Pair for given Sum " + sum + " is between " + root.data + " and " + (sum - root.data));
			return true;
		} else {
			set.add(root.data);

		}
		return isSum(set, root.right, sum);

	}
}
