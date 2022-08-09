package com.example.bubbleSort;

import java.util.ArrayList;
import java.util.List;

public class LinkedListNode {

    public int value;

    public LinkedListNode left;

    public LinkedListNode right;

    public LinkedListNode root;

    public LinkedListNode() {

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


    public LinkedListNode getLeft() {
        return left;
    }

    public LinkedListNode getRight() {
        return right;
    }

    public void setLeft(LinkedListNode left) {
        this.left = left;
    }


    public void setRight(int value) {
        this.right = new LinkedListNode(value);
    }

    @Override
    public String toString() {
        return "Bubble{" +
                "value=" + value +
                '}';
    }

    public LinkedListNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}