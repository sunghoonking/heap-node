package com.example.lastheap;

public class HeapNode<T> {
    private ProductNdxpro element;

    private HeapNode<T> left;

    private HeapNode<T> right;


    public HeapNode(ProductNdxpro element, HeapNode<T> left, HeapNode<T> right) {
        this.element = element;
        this.left = left;
        this.right = right;
    }

    public void setLeft(HeapNode<T> left){
        this.left = left;
    }

    public void setRight(HeapNode<T> right){
        this.right = right;
    }

    public void setElement(ProductNdxpro element) {
        this.element = element;
    }

    public ProductNdxpro getElement() {
        return element;
    }

    public HeapNode<T> getLeft() {
        return left;
    }

    public HeapNode<T> getRight() {
        return right;
    }

    public boolean isNullLeft() {
        return this.left == null;
    }

    public boolean isNullRight() {
        return this.right == null;
    }

    @Override
    public String toString() {
        return "HeapNode{" +
                "element=" + element +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}