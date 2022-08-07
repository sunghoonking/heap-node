package com.example.lastheap;

import java.util.ArrayList;

public class HeapSortNDXPRO<T>  {
    public static void main(String[] args) {


        ArrayList<HeapNode> productNdx = new ArrayList<>();

        HeapNode<ProductNdxpro> a = new HeapNode<ProductNdxpro>(new ProductNdxpro("SF", "용역 (NFLOW)", "용역", "NFLOW", 2,"FY"),null,null);
        HeapNode<ProductNdxpro> b = new HeapNode<ProductNdxpro>(new ProductNdxpro("SN", "용역 (NDX Pro)", "용역", "NDX PRO", 4,"PY"),null,null);
        HeapNode<ProductNdxpro> c = new HeapNode<ProductNdxpro>(new ProductNdxpro("RD", "R&D/지원사업", "R&D", "R&D", 5,"RD"),null,null);
        HeapNode<ProductNdxpro> d = new HeapNode<ProductNdxpro>(new ProductNdxpro("PF", "라이선스 (NFLOW)", "라이선스", "NFLOW", 1,"FL"),null,null);
        HeapNode<ProductNdxpro> e = new HeapNode<ProductNdxpro>(new ProductNdxpro("PN", "라이선스 (NDX Pro)", "라이선스", "NDX PRO", 3,"PL"),null,null);

        productNdx.add(a);
        productNdx.add(b);
        productNdx.add(c);
        productNdx.add(d);
        productNdx.add(e);

        sortHeap(productNdx);

        System.out.println("끝 " + productNdx);
    }


    public static void sortHeap(ArrayList<HeapNode> heapNode) {


        heaPify(heapNode,heapNode.size());

        for (int i = heapNode.size()-1; i >0 ; i--) {
            swap(heapNode,0,i);
            heaPify(heapNode,i);
        }

    }
    public static void heaPify(ArrayList<HeapNode> rootNode, int size) {
        //5  //1,2,3,4
        for (int i = 1; i < size; i++) {  //4
                                             //4
            int child = i; // ==1     //  1,2,3,4

            while (child > 0) {

                int parent = (child-1)/2;

                if (rootNode.get(child).getElement().getOrderNuml() > rootNode.get(parent).getElement().getOrderNuml()){

                    swap(rootNode,child,parent);
                }
                // 1 = 0
                child = parent;
            }

        }

        System.out.println("최대힙" + rootNode);

    }
    private static void swap(ArrayList<HeapNode> rootNode, int child, int parent) {

        ProductNdxpro element = rootNode.get(child).getElement();
        rootNode.get(child).setElement(rootNode.get(parent).getElement());
        rootNode.get(parent).setElement(element);

    }

}
