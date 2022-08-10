package com.example.bubbleSort;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

    public static void main(String[] args) {

        LinkedListNode rootNode = new LinkedListNode(5);

        addList(rootNode, 3);
        addList(rootNode, 5);
//        addList(rootNode, 6);
//        addList(rootNode, 7);
//        addList(rootNode, 1);
//        addList(rootNode, 4);

        bubble(rootNode);

        List<Integer> integers = easyPrint(rootNode);

        System.out.println(integers);

        System.out.println(rootNode);
        System.out.println(rootNode.right);
        System.out.println(rootNode.right.right);
//        System.out.println(rootNode.right.right.right);
//        System.out.println(rootNode.right.right.right.right);
//        System.out.println(rootNode.right.right.right.right.right);
//        System.out.println(rootNode.right.right.right.right.right.right);

    }

    private static List<Integer> easyPrint(LinkedListNode rootNode) {
        int size = getSize(rootNode);

        LinkedListNode temp = new LinkedListNode();

        List<Integer> num = new ArrayList<>();
        temp = rootNode;

        for (int i = 1; i < size; i++) {
            while (temp.right != null) {
                num.add(temp.value);
                temp = temp.right;
                if (temp.right == null) {
                    num.add(temp.value);
                }
            }
        }
        return num;

    }

    private static void bubble(LinkedListNode rootNode) {
        // 이제 노드들을 비교해서 정렬
        int size = getSize(rootNode);
        LinkedListNode temp = rootNode;  // 빈 주소 노드

        for (int i = 0; i < size; i++) {
            for (int j = size; j != 0; j--) {
                if (temp.value > temp.right.value) {
                    swap(temp);
                    temp = temp.right;
                }
                size--;
            }
        }
    }

    private static void swap(LinkedListNode rootNode) {

        LinkedListNode first = rootNode;         // 5   == rootNode

        LinkedListNode second = first.right;     // 3   == rootNode.right

        LinkedListNode third = second.right;     // 2   == rootNode.right.right

        rootNode = rootNode.right;         // 5의 위치에 3이 들어감

        rootNode.right = first;







//        rootNode.right = first;            // 기존에 3은 루트 노드 위치에
//
//        rootNode.right.right = secon
//
    }

    private static int getSize(LinkedListNode rootNode) {

        int a = 1;    // asdadㅁㄴㅇㅁㄴㅇㅁㄴㅇ

        LinkedListNode temp = rootNode;

        while (temp.right != null) {
            a++;
            temp = temp.right;
        }
        return a;
    }

    private static void addList(LinkedListNode rootNode, int i) {

        LinkedListNode temp = new LinkedListNode();  // 빈 주소 노드

        temp = rootNode;   //템프라는 노드에 루트노드 주소값이 들어

        while (temp.right != null) {   // 템프(루트) 노드에 right의 값이 null이 아닐 때까지
            temp = temp.getRight();  // 템프(루트) 노드는 템프(루트) 노드의 right 노드의 주소값을 가짐
        }

        temp.setRight(i);  // 템프 노드에는 새로운 값을 가진 노드를 저장함

    }

//    public static void bubbleSort(LinkedList<LinkedListNode> integers){
//    aaaaa
//        for (int j = 0; j < integers.size(); j++) {
//            for (int i = 0; i < integers.size()-1; i++) {
//                if (integers.get(i).value > integers.get(i+1).value){
//                    swap(integers,i,i+1);
//                }
//            }
//        }
//    }
//
//    public static void swap(LinkedList<LinkedListNode> integers, int a, int b){
//
//        int value1 = integers.get(a).value;
//        integers.get(a).value = integers.get(b).value;
//        integers.get(b).value = value1;
//
//    }

}
