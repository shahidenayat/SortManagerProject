package com.sparta.shahid.binaryTree;


public class BinaryTreeImplementation implements BinaryTree {

    private final Node rootNode;
    int count; // number of items in the tree
    private int[] sortedArrayAsc;
    private int[] sortedArrayDesc;
    private int arrayCount; //array index

    public BinaryTreeImplementation(int value) {
        rootNode = new Node(value);
        count = 1;
    }


    public BinaryTreeImplementation(int[] value) {
        if (value.length == 0){
            throw new IllegalArgumentException("Must be of size greater than zero");
        }
        rootNode = new Node(value[0]);
        count = 1;
        addElements(value);
    }


    @Override
    public int getRootElement() {
        return getRootNode();
    }

    @Override
    public int getNumberOfElements() {
        return count;
    }

    @Override
    public void addElement(int element) {
        boolean added = addLeftOrRight(rootNode, element);
        if(added){
            count++;
        }
    }

    @Override
    public void addElements(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            addElement(elements[i]);
        }
    }

    @Override
    public boolean findElement(int value) {
        Node currentNode = rootNode;
        while(currentNode != null)
        {
            if(value == currentNode.getValue()){
                return true;
            }
            if (value > currentNode.getValue()){
                currentNode = currentNode.getRightChild();
            }
            else {
                currentNode = currentNode.getLeftChild();
            }
        }
        return false;
    }

    @Override
    public int getLeftChild(int element) {
        return 0;
    }

    @Override
    public int getRightChild(int element) {
        return 0;
    }

    @Override
    public int[] getSortedTreeAsc() {
        Node node = rootNode;
        arrayCount = 0;
        sortedArrayAsc = new int[count];
        sortTreeAsc(node);
        return sortedArrayAsc;
    }
    @Override
    public int[] getSortedTreeDesc(){
        Node node = rootNode;
        arrayCount = 0;
        sortedArrayDesc = new int[count];
        sortTreeDesc(node);
        return sortedArrayDesc;
    }

    public int getRootNode() {
        return rootNode.getValue();
    }

    private int[] sortTreeDesc(Node node){
        int value = node.getValue();
        if(!node.isRightNodeEmpty()){
            sortTreeDesc(node.getRightChild());
        }
        sortedArrayDesc[arrayCount] = value;
        arrayCount++;
        if (!node.isLeftNodeEmpty()) {
            sortTreeDesc(node.getLeftChild());
        }
        return sortedArrayDesc;
    }

    private int[] sortTreeAsc(Node node) {           // helper
        int value = node.getValue();
        if (!node.isLeftNodeEmpty()) {
            sortTreeAsc(node.getLeftChild());
        }
        sortedArrayAsc[arrayCount] = value;
        arrayCount++;
        if (!node.isRightNodeEmpty()) {
            sortTreeAsc(node.getRightChild());
        }
        return sortedArrayAsc;
    }

    private boolean addLeftOrRight(Node node, int element) {
        if (element < node.getValue()) {
            if (node.getLeftChild() == null) {
                node.setLeftChild(new Node(element));
                return true;
            } else {
                return addLeftOrRight(node.getLeftChild(), element);
            }
        } else if (element > node.getValue()) {
            if (node.getRightChild() == null) {
                node.setRightChild(new Node(element));
                return true;
            } else {
                return addLeftOrRight(node.getRightChild(), element);
            }
        }

        return false;
    }

}
