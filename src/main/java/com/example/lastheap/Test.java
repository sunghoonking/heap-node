package com.example.lastheap;

import java.util.ArrayList;

public class Test<T>{
        public static void main(String[] args) {



            ProductNdxpro root = new ProductNdxpro("SF", "용역 (NFLOW)", "용역", "NFLOW", 2,"FY");
            ProductNdxpro right = new ProductNdxpro("SN", "용역 (NDX Pro)", "용역", "NDX PRO", 4,"PY");
            ProductNdxpro left = new ProductNdxpro("RD", "R&D/지원사업", "R&D", "R&D", 5,"RD");
            ProductNdxpro right1 = new ProductNdxpro("PF", "라이선스 (NFLOW)", "라이선스", "NFLOW", 1,"FL");
            ProductNdxpro left1 = new ProductNdxpro("PN", "라이선스 (NDX Pro)", "라이선스", "NDX PRO", 3,"PL");

            ArrayList<ProductNdxpro> productNdxpros = new ArrayList<>();
            productNdxpros.add(root);
            productNdxpros.add(right);
            productNdxpros.add(left);
            productNdxpros.add(right1);
            productNdxpros.add(left1);



            sortHeap(productNdxpros);

            System.out.println("끝 " + productNdxpros);
        }


        public static void sortHeap(ArrayList<ProductNdxpro> heapNode) {

        NdxProNode<ProductNdxpro> root = null;

        for (int i = 0; i < heapNode.size(); i++) {

            NdxProNode<ProductNdxpro> productNdxproHeapNode = new NdxProNode<>(heapNode.get(i), null, null);

            if (root == null) {
                root = productNdxproHeapNode;
                continue;
            }


        }


        }
        public static void heaPify(ArrayList<ProductNdxpro> rootNode, int size) {
            for (int i = 1; i < size; i++) {
                int child = i;
                while (child >0) {
                    int parent = (child-1)/2;
                    if (rootNode.get(child).getOrderNuml() > rootNode.get(parent).getOrderNuml()){
//                    swap(rootNode.get(child), rootNode.get(parent));
                        swap(rootNode.get(child), rootNode.get(parent));
                    }
                    child = parent;
                }

            }

            System.out.println("최대힙" + rootNode);

        }
        private static void swap(ProductNdxpro root, ProductNdxpro productNdxproHeapNode) {

            int orderNuml = root.orderNuml;
            root.orderNuml = productNdxproHeapNode.orderNuml;
            productNdxproHeapNode.orderNuml = orderNuml;
        }
        // 만약에 루트 노드 - 자식노드 가 0보다 크면 순서 체인지
        // 2 - 4
        private static int compare(NdxProNode<ProductNdxpro> a, NdxProNode<ProductNdxpro> b) {
            return a.getElement().getOrderNuml() - b.getElement().getOrderNuml();
        }
//
//    class Wrapper{
//        HeapNode<ProductNdxpro> productNdxproHeapNode;
//        Wrapper(<ProductNdxpro productNdxproHeapNode){
//            this.productNdxproHeapNode =productNdxproHeapNode;
//        }
//    }



}
