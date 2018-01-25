package me.cooper.rick.hackerrank.binarysearchtrees;

import java.util.Scanner;

import static java.lang.Integer.max;

public class Solution {
    public static int getHeight(Node root) {
        return (root == null) ? -1 : max(getHeight(root.left), getHeight(root.right)) + 1;
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
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
        int height = getHeight(root);
        System.out.println(height);
    }

    public static class Node {
        public Node left, right;
        public int data;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
}