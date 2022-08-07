package com.example.lastheap;

public class NdxProNode<T> {

    private ProductNdxpro element;

    private NdxProNode<T> left;

    private NdxProNode<T> right;


    public NdxProNode(ProductNdxpro element, NdxProNode<T> left, NdxProNode<T> right) {
        this.element = element;
        this.left = left;
        this.right = right;
    }

    public void setLeft(NdxProNode<T> left){
        this.left = left;
    }

    public void setRight(NdxProNode<T> right){
        this.right = right;
    }

    public void setElement(ProductNdxpro element) {
        this.element = element;
    }

    public ProductNdxpro getElement() {
        return element;
    }

    public NdxProNode<T> getLeft() {
        return left;
    }

    public NdxProNode<T> getRight() {
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