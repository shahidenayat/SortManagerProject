package com.sparta.shahid.binaryTree;

public class Node {

    private final int value;
    private Node leftChild;
    private Node rightChild;

    public Node(int value) {
        this.value = value;
    }

    public void createLeftNode(int value) {
        leftChild = new Node(value);
    }

    public void createRightNode(int value) {
        rightChild = new Node(value);
    }

    public int getValue() {
        return value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public boolean isLeftNodeEmpty() {
        if (leftChild == null) {
            return true;
        }
        return false;
    }

    public boolean isRightNodeEmpty() {
        if (rightChild == null) {
            return true;
        }
        return false;
    }
}
