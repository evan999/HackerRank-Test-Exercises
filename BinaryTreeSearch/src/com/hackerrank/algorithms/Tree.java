package com.hackerrank.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tree {

    public class Node {
        Node left;
        Node right;
        int data;

        public Node(int key) {
            left = null;
            right = null;
            key = data;
        }

//        public Node() {
//            left = null;
//            right = null;
//            this.data = data;
//        }
    }
    Node root;

    public Tree() {
        root = null;
    }

    // Returns a list of integers where each value at index i denotes
    // whether value[i] is found in the BST or not

    // node values = [20, 10, 30, 0, 12, 25, 40, 6, 11, 13, 23]
    // values = [30, 10, 12, 15]
    // Check if each value is in the tree
    // if value at index i is in tree, return 1
    // else return 0

    // if root is null
    //    return list of 0s

    // Declare empty result list
    // Need to traverse binary tree
    // Check left and right child of root
    // Traverse to the left with a left pointer, to the right with right pointer
    // if node's value data is equal to value at index
    //    add 1 to list
    //    increment index and return to root node
    // else continue until end of tree
    // if end of tree (trav.left and trav.right are both null)
    //    add 0 to list
    //    increment index
    //    return to root and repeat from line 45
    // Compare each node's value with value at index in list
    // Loop through values in list

    // Appears to be a recursive pattern
    // Could we use recursion to solve this?

    // while trav.left is not null and trav.right is not null
    //    if value at trav equals value at index
    //       add 1 to result list
    //    else
    //       assign trav to left of trav -> trav = trav.left
    //
    //    i

//    public static void traverseTree(Node root) {
//
//    }

    public static List<Integer> isPresent(Node root, List<Integer> values) {
        List<Integer> result = new ArrayList<>();
        return result;
    }



    public static void main(String[] args) {
	// write your code here
        Node root = new Node()
        List<Integer> nodeValues =
                new ArrayList<>(Arrays.asList(20, 10, 30, 8, 12, 25, 40, 6, 11, 13, 23));
        isPresent(Arrays.asList());
    }
}
