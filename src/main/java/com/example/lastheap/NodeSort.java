package com.example.lastheap;

import java.util.ArrayList;
import java.util.Comparator;

public class NodeSort {
    private static Node root;
    private static Node cursor;

    public static void main(String[] args) {

        ArrayList<Node> arr = new ArrayList<>();

        Node root = null;

//        arr.add(new Node(4,new Node(1,new Node(2,null,null),new Node(5,null,null)),new Node(3,null,null)));
        arr.add(new Node(4,null,null));
        arr.add(new Node(1,null,null));
        arr.add(new Node( 3,null,null));
        arr.add(new Node(2,null,null));
        arr.add(new Node(5,null,null));

        heapSort(arr);



//        Node node = new Node(4,new Node(1,new Node(2,null,null),new Node(5,null,null)),new Node(3,null,null));

        System.out.println("마지막" + arr);
    }


    public static void heapSort(ArrayList<Node> arr){

        root = arr.get(0);
        cursor = root;


        int size = arr.size();

        for (int i = 1; i <arr.size() ; i++) {
            heaPify(cursor);
        }

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).left == null){
                if (i * 2 + 1 < size){
                    cursor.left = arr.get(i * 2 +1);
                }
            }
            if (arr.get(i).right == null){
                if (i * 2 + 2 < size){
                    cursor.right = arr.get(i * 2+ 2);
                }
            }
        }

    }

    private static void heaPify(Node node){

        Node parent = node;
        Node maxNode = Max(parent,cursor.left,cursor.right); // 가장 큰 값을 가지고 있는 노드
        if (parent != maxNode){
            swap(parent,maxNode);
            cursor = maxNode;
            heaPify(parent);
        }
    }

    private static void swap(Node a, Node b){
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }

    private static Node Max(Node a, Node b, Node c) {
        ArrayList<Node> linkedList = new ArrayList<>();
        linkedList.add(a);
        linkedList.add(b);
        linkedList.add(c);


//        for (int i = 0; i < linkedList.size() ; i++) {
//            if (linkedList.get(i).right == null || linkedList.get(i).left == null ){
//                linkedList.get(i).setValue(0);
//                linkedList.get(i).setRight(null);
//                linkedList.get(i).setLeft(null);
//
//            }
//    }
        linkedList.sort(new Comparator<>() {
            @Override
            public int compare(Node c1, Node c2) {

                return c2.value - c1.value;
            }
        });
        Node first = linkedList.get(0);
        return first;
    }

}
