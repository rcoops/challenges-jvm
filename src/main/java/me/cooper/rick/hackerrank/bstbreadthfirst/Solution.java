package me.cooper.rick.hackerrank.bstbreadthfirst;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import static me.cooper.rick.hackerrank.binarysearchtrees.Solution.Node;
import static me.cooper.rick.hackerrank.binarysearchtrees.Solution.insert;

public class Solution {

    static void levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        if (root == null) return;
        queue.add(root);
        // add root to the queue
        while (!queue.isEmpty()) {
            Node n = queue.remove();
            System.out.print(n.data + " ");
            if (n.left != null) {
                queue.add(n.left);
            }
            if (n.right != null) {
                queue.add(n.right);
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }
}